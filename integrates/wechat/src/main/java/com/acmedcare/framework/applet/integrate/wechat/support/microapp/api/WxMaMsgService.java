package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaTemplateMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaUniformMessage;

/**
 *
 *
 * <pre>
 * 消息发送接口
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxMaMsgService {
  String KEFU_MESSAGE_SEND_URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send";
  String TEMPLATE_MSG_SEND_URL = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send";
  String UNIFORM_MSG_SEND_URL =
      "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/uniform_send";

  /**
   *
   *
   * <pre>
   * 发送客服消息
   * 详情请见: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/customerServiceMessage.send.html">发送客服消息</a>
   * 接口url格式：https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN
   * </pre>
   */
  boolean sendKefuMsg(WxMaKefuMessage message) throws WxErrorException;

  /**
   *
   *
   * <pre>
   * 发送模板消息
   * 详情请见: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/templateMessage.send.html">发送模板消息</a>
   * 接口url格式：https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send?access_token=ACCESS_TOKEN
   * </pre>
   */
  void sendTemplateMsg(WxMaTemplateMessage templateMessage) throws WxErrorException;

  /**
   *
   *
   * <pre>
   * 下发小程序和公众号统一的服务消息
   * 详情请见: <a href="https://developers.weixin.qq.com/miniprogram/dev/api/open-api/uniform-message/sendUniformMessage.html">下发小程序和公众号统一的服务消息</a>
   * 接口url格式：https://api.weixin.qq.com/cgi-bin/message/wxopen/template/uniform_send?access_token=ACCESS_TOKEN
   * </pre>
   */
  void sendUniformMsg(WxMaUniformMessage uniformMessage) throws WxErrorException;
}
