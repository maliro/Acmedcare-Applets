package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result;

import lombok.Data;

import java.util.List;
import java.util.Map;

/** @author robgao */
@Data
public class WxOpenAuthorizerListResult {
  private int totalCount;
  private List<Map<String, String>> list;
}
