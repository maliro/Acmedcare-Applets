package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 *
 * <pre>
 *  Created by BinaryWang on 2017/6/18.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@XStreamAlias("xml")
public class WxPaySandboxSignKeyResult extends BaseWxPayResult {

  /**
   *
   *
   * <pre>
   * 沙箱密钥
   * sandbox_signkey
   * 否
   * 013467007045764
   * String(32)
   * 返回的沙箱密钥
   * </pre>
   */
  @XStreamAlias("sandbox_signkey")
  private String sandboxSignKey;
}
