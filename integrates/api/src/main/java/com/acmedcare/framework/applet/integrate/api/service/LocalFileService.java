package com.acmedcare.framework.applet.integrate.api.service;

import com.acmedcare.framework.applet.api.exception.FileException;
import com.acmedcare.framework.applet.api.exception.FileNotFoundException;
import com.acmedcare.framework.applet.integrate.api.AppletsContext;
import com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties;
import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.integrate.api.bean.*;
import com.acmedcare.framework.applet.integrate.api.spi.FileService;
import com.acmedcare.framework.applet.integrate.common.kits.FileNameUtil;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import com.acmedcare.framework.applet.integrate.storage.api.DefaultAppletsRepository;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletCommonModel;
import com.acmedcare.framework.kits.Assert;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import static com.acmedcare.framework.applet.integrate.api.endpoints.NasEndpoint.FILE_PUBLISH_URI_TEMPLATE;
import static com.acmedcare.framework.applet.integrate.api.service.LocalFileService.EXTENSION_NAME;
import static com.acmedcare.framework.applet.integrate.storage.api.AppletsRepositoryConstants.DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME;

/**
 * {@link LocalFileService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Extension(EXTENSION_NAME)
public class LocalFileService implements FileService {

  private static final Logger log = LoggerFactory.getLogger(LocalFileService.class);

  /** Extension Service Name */
  static final String EXTENSION_NAME = "local";

  @Override
  public UploadFileResponse upload(UploadFileRequest request) throws FileException {

    try {
      AppletsIntegrateProperties properties = AppletsContext.context().getProperties();

      String fileFullPath =
          properties
              .getFileStorageConfig()
              .getLocalStoragePath()
              .concat(FileNameUtil.newFileStorageDatePath())
              .concat(request.getFileKey());

      log.info("[==Applets File==] upload full file path : {}", fileFullPath);

      FileUtils.writeByteArrayToFile(new File(fileFullPath), request.getFile());
      String publishUrl =
          properties
              .getFileStorageConfig()
              .getLocalStoragePublishUrlPrefix()
              .concat(String.format(FILE_PUBLISH_URI_TEMPLATE, request.getFileKey()));

      String checksum = DigestUtils.md5Hex(request.getFile());

      // Hit: save to repository
      NasFileBean fileBean =
          NasFileBean.builder()
              .checksum(checksum)
              .fileKey(request.getFileKey())
              .filePublishUrl(publishUrl)
              .fileSize(request.getFile().length)
              .mediaType(request.getMediaType().toString())
              .storageType(AppletsIntegrateProperties.FileStorageType.LOCAL)
              .uploadTime(new Date())
              .build();

      DefaultAppletsRepository repository =
          (DefaultAppletsRepository)
              AppletsSPIExtensionFactory.getRepository(
                  DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME, AppletsRepository.class);

      AppletCommonModel.AppletCommonModelKey<String> key =
          AppletCommonModel.AppletCommonModelKey.<String>commonModelKeyBuilder()
              .namespace(FILE_NAMESPACE)
              .key(request.getFileKey())
              .commonkeyBuild();

      repository.saveFile(key, fileBean);

      return UploadFileResponse.builder()
          .fileKey(request.getFileKey())
          .filePublishUrl(publishUrl)
          .fileSize(request.getFile().length)
          .mediaType(request.getMediaType().toString())
          .fileChecksum(checksum)
          .build();

    } catch (Exception e) {
      e.printStackTrace();
      throw new FileException("[==Applets File==] save file to disk failed .", e);
    }
  }

  @Override
  public DownloadFileResponse download(DownloadFileRequest request) throws FileException {

    try {

      DefaultAppletsRepository repository =
          (DefaultAppletsRepository)
              AppletsSPIExtensionFactory.getRepository(
                  DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME, AppletsRepository.class);

      AppletCommonModel.AppletCommonModelKey<String> key =
          AppletCommonModel.AppletCommonModelKey.<String>commonModelKeyBuilder()
              .namespace(FILE_NAMESPACE)
              .key(request.getFileId())
              .commonkeyBuild();

      NasFileBean fileBean = repository.queryFile(key, NasFileBean.class);

      Assert.notNull(fileBean);
      log.info("[==Applets File==] download file, get file info: {}", fileBean);

      if (!fileBean.getStorageType().equals(AppletsIntegrateProperties.FileStorageType.LOCAL)) {
        throw new FileException("[==Applets File==] invalid file storage type.");
      }

      // get file byte[]
      AppletsIntegrateProperties properties = AppletsContext.context().getProperties();

      String fileFullPath =
          properties
              .getFileStorageConfig()
              .getLocalStoragePath()
              .concat(FileNameUtil.newFileStorageDatePath(fileBean.getUploadTime()))
              .concat(request.getFileId());

      log.info("[==Applets File==] download file, parsed file full path : {}", fileFullPath);

      if (!Files.exists(Paths.get(fileFullPath))) {
        throw new FileNotFoundException("File: " + request.getFileId() + " is not exist");
      }

      byte[] file = FileUtils.readFileToByteArray(new File(fileFullPath));

      return DownloadFileResponse.builder()
          .checksum(fileBean.getChecksum())
          .mediaType(fileBean.getMediaType())
          .fileId(fileBean.getFileKey())
          .file(file)
          .build();

    } catch (FileNotFoundException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
      throw new FileException("[==Applets File==] download file failed .", e);
    }
  }
}
