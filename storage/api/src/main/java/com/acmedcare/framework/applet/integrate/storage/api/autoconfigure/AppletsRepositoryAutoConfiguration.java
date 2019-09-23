package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import static com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryProperties.INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AppletsRepositoryAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX,
    matchIfMissing = true,
    name = "enabled",
    havingValue = "true")
@EnableConfigurationProperties(AppletsRepositoryProperties.class)
public class AppletsRepositoryAutoConfiguration {





}
