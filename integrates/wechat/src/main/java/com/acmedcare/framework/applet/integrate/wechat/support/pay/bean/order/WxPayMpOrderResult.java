package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.order;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * <pre>
 * 微信公众号支付进行统一下单后组装所需参数的类
 * 文档地址：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=7_7&index=6
 * Created by Acmedcare+ Developer on 2017-9-1.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@Builder
public class WxPayMpOrderResult implements Serializable {
  private static final long serialVersionUID = -7966682379048446567L;

  private String appId;
  private String timeStamp;
  private String nonceStr;
  /** 由于package为java保留关键字，因此改为packageValue. 前端使用时记得要更改为package */
  @XStreamAlias("package")
  private String packageValue;

  private String signType;
  private String paySign;
}
