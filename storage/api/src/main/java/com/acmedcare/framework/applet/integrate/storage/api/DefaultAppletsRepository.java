package com.acmedcare.framework.applet.integrate.storage.api;

import com.acmedcare.framework.applet.api.bean.Principal;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;

import static com.acmedcare.framework.applet.integrate.storage.api.AppletsRepositoryConstants.DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME;

/**
 * {@link DefaultAppletsRepository}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
@Extension(DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME)
public class DefaultAppletsRepository extends AppletsRepository {

  @Override
  public void savePrincipal(AppletAuthModel.AppletAuthModelKey key, Principal principal) {
    super.savePrincipal(key, principal);
  }
}
