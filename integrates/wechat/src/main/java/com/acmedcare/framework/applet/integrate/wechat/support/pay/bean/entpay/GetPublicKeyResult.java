package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.entpay;

import com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.result.BaseWxPayResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * <pre>
 *  企业付款获取RSA加密公钥接口返回结果类
 *  Created by BinaryWang on 2017/12/20.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@XStreamAlias("xml")
public class GetPublicKeyResult extends BaseWxPayResult {
  /** 商户号. */
  @XStreamAlias("mch_id")
  private String mchId;

  /** 密钥 */
  @XStreamAlias("pub_key")
  private String pubKey;
}
