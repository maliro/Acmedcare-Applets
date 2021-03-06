package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaQrcodeService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaCodeLineColor;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaQrcode;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxaCode;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxaCodeUnlimit;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.QrcodeBytesRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.QrcodeRequestExecutor;

import java.io.File;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaQrcodeServiceImpl implements WxMaQrcodeService {
  private WxMaService wxMaService;

  public WxMaQrcodeServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }

  @Override
  public byte[] createQrcodeBytes(String path, int width) throws WxErrorException {
    final QrcodeBytesRequestExecutor executor =
        new QrcodeBytesRequestExecutor(this.wxMaService.getRequestHttp());
    return this.wxMaService.execute(executor, CREATE_QRCODE_URL, new WxMaQrcode(path, width));
  }

  @Override
  public File createQrcode(String path, int width) throws WxErrorException {
    final QrcodeRequestExecutor executor =
        new QrcodeRequestExecutor(this.wxMaService.getRequestHttp());
    return this.wxMaService.execute(executor, CREATE_QRCODE_URL, new WxMaQrcode(path, width));
  }

  @Override
  public File createQrcode(String path) throws WxErrorException {
    return this.createQrcode(path, 430);
  }

  @Override
  public byte[] createWxaCodeBytes(
      String path, int width, boolean autoColor, WxMaCodeLineColor lineColor, boolean isHyaline)
      throws WxErrorException {
    final QrcodeBytesRequestExecutor executor =
        new QrcodeBytesRequestExecutor(this.wxMaService.getRequestHttp());
    return this.wxMaService.execute(
        executor,
        GET_WXACODE_URL,
        WxaCode.builder()
            .path(path)
            .width(width)
            .autoColor(autoColor)
            .lineColor(lineColor)
            .isHyaline(isHyaline)
            .build());
  }

  @Override
  public File createWxaCode(
      String path, int width, boolean autoColor, WxMaCodeLineColor lineColor, boolean isHyaline)
      throws WxErrorException {
    final QrcodeRequestExecutor executor =
        new QrcodeRequestExecutor(this.wxMaService.getRequestHttp());
    return this.wxMaService.execute(
        executor,
        GET_WXACODE_URL,
        WxaCode.builder()
            .path(path)
            .width(width)
            .autoColor(autoColor)
            .lineColor(lineColor)
            .isHyaline(isHyaline)
            .build());
  }

  @Override
  public File createWxaCode(String path, int width) throws WxErrorException {
    return this.createWxaCode(path, width, true, null, false);
  }

  @Override
  public File createWxaCode(String path) throws WxErrorException {
    return this.createWxaCode(path, 430);
  }

  @Override
  public byte[] createWxaCodeUnlimitBytes(
      String scene,
      String page,
      int width,
      boolean autoColor,
      WxMaCodeLineColor lineColor,
      boolean isHyaline)
      throws WxErrorException {
    return this.wxMaService.execute(
        new QrcodeBytesRequestExecutor(this.wxMaService.getRequestHttp()),
        GET_WXACODE_UNLIMIT_URL,
        this.buildWxaCodeUnlimit(scene, page, width, autoColor, lineColor, isHyaline));
  }

  @Override
  public File createWxaCodeUnlimit(
      String scene,
      String page,
      int width,
      boolean autoColor,
      WxMaCodeLineColor lineColor,
      boolean isHyaline)
      throws WxErrorException {
    return this.wxMaService.execute(
        new QrcodeRequestExecutor(this.wxMaService.getRequestHttp()),
        GET_WXACODE_UNLIMIT_URL,
        this.buildWxaCodeUnlimit(scene, page, width, autoColor, lineColor, isHyaline));
  }

  private WxaCodeUnlimit buildWxaCodeUnlimit(
      String scene,
      String page,
      int width,
      boolean autoColor,
      WxMaCodeLineColor lineColor,
      boolean isHyaline) {
    WxaCodeUnlimit wxaCodeUnlimit = new WxaCodeUnlimit();
    wxaCodeUnlimit.setScene(scene);
    wxaCodeUnlimit.setPage(page);
    wxaCodeUnlimit.setWidth(width);
    wxaCodeUnlimit.setAutoColor(autoColor);
    wxaCodeUnlimit.setLineColor(lineColor);
    wxaCodeUnlimit.setHyaline(isHyaline);

    return wxaCodeUnlimit;
  }

  @Override
  public File createWxaCodeUnlimit(String scene, String page) throws WxErrorException {
    return this.createWxaCodeUnlimit(scene, page, 430, true, null, false);
  }
}
