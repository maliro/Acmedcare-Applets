package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaTemplateService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.template.WxMaTemplateAddResult;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.template.WxMaTemplateLibraryGetResult;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.template.WxMaTemplateLibraryListResult;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.template.WxMaTemplateListResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WxMaTemplateServiceImpl implements WxMaTemplateService {

  private WxMaService wxMaService;

  public WxMaTemplateServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }

  @Override
  public WxMaTemplateLibraryListResult findTemplateLibraryList(int offset, int count)
      throws WxErrorException {

    Map<String, Integer> params = new HashMap<>();
    params.put("offset", offset);
    params.put("count", count);

    String responseText =
        this.wxMaService.post(TEMPLATE_LIBRARY_LIST_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateLibraryListResult.fromJson(responseText);
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public WxMaTemplateLibraryGetResult findTemplateLibraryKeywordList(String id)
      throws WxErrorException {

    Map<String, String> params = new HashMap<>();
    params.put("id", id);

    String responseText =
        this.wxMaService.post(TEMPLATE_LIBRARY_KEYWORD_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateLibraryGetResult.fromJson(responseText);
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public WxMaTemplateAddResult addTemplate(String id, List<Integer> keywordIdList)
      throws WxErrorException {

    Map<String, Object> params = new HashMap<>();
    params.put("id", id);
    params.put("keyword_id_list", keywordIdList.toArray());

    String responseText =
        this.wxMaService.post(TEMPLATE_ADD_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateAddResult.fromJson(responseText);
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public WxMaTemplateListResult findTemplateList(int offset, int count) throws WxErrorException {

    Map<String, Integer> params = new HashMap<>();
    params.put("offset", offset);
    params.put("count", count);

    String responseText =
        this.wxMaService.post(TEMPLATE_LIST_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateListResult.fromJson(responseText);
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public boolean delTemplate(String templateId) throws WxErrorException {
    Map<String, String> params = new HashMap<>();
    params.put("template_id", templateId);

    String responseText =
        this.wxMaService.post(TEMPLATE_DEL_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if (wxError.getErrorCode() == 0) {
      return true;
    } else {
      throw new WxErrorException(wxError);
    }
  }
}
