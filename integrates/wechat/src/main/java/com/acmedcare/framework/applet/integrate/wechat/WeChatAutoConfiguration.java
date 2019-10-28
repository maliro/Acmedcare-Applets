package com.acmedcare.framework.applet.integrate.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import static com.acmedcare.framework.applet.integrate.wechat.WeChatIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link WeChatAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX,
    name = "enabled",
    havingValue = "true")
@EnableConfigurationProperties(WeChatIntegrateProperties.class)
@ComponentScan(basePackageClasses = WeChatIntegrateProperties.class)
public class WeChatAutoConfiguration {

  private static final Logger log = LoggerFactory.getLogger(WeChatAutoConfiguration.class);

  @EventListener
  public void onApplicationReadyEvent(ApplicationReadyEvent event) {
    WeChatAppletContext.refresh(
        event.getApplicationContext().getBeanFactory(),
        event.getApplicationContext().getEnvironment());
    log.info("[==WeChat Applet==] wechat context is refreshed.");
  }
}
