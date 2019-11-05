/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.acmedcare.framework.applet.integrate.alipay.support.api.msg;

/**
 * @author liuqun.lq
 * @version $Id: MessageHandler.java, v 0.1 2018年08月31日 16:52 liuqun.lq Exp $
 */
public interface MsgHandler {

    public void onMessage(String msgApi, String msgId, String bizContent);
}