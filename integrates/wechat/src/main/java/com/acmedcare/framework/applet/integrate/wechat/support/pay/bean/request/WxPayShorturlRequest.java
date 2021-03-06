package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.*;

/**
 *
 *
 * <pre>
 * 转换短链接请求对象类
 * Created by Acmedcare+ Developer on 2017-3-27.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("xml")
public class WxPayShorturlRequest extends BaseWxPayRequest {
  /**
   *
   *
   * <pre>
   * URL链接
   * long_url
   * 是
   * String(512)
   * weixin：//wxpay/bizpayurl?sign=XXXXX&appid=XXXXX&mch_id=XXXXX&product_id=XXXXXX&time_stamp=XXXXXX&nonce_str=XXXXX
   * 需要转换的URL，签名用原串，传输需URLencode
   * </pre>
   */
  @XStreamAlias("long_url")
  private String longUrl;

  @Override
  protected void checkConstraints() {
    // do nothing
  }
}
