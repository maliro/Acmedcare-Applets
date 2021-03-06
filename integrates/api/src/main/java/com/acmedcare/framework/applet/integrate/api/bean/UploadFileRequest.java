package com.acmedcare.framework.applet.integrate.api.bean;

import lombok.*;

import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * {@link UploadFileRequest}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadFileRequest implements Serializable {

  private String fileKey;

  private byte[] file;

  private MediaType mediaType;

}
