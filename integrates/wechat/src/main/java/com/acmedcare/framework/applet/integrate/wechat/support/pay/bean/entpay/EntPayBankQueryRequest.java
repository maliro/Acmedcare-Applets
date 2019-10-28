package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.entpay;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 *
 * <pre>
 * 企业付款到银行卡的请求对象
 * Created by Binary Wang on 2017/12/21.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@XStreamAlias("xml")
public class EntPayBankQueryRequest extends EntPayQueryRequest {
  private static final long serialVersionUID = -479088843124447119L;

  @Override
  protected boolean ignoreAppid() {
    return true;
  }
}
