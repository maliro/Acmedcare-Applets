package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.WxMpMassVideo;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMpMassVideoAdapter implements JsonSerializer<WxMpMassVideo> {

  @Override
  public JsonElement serialize(
      WxMpMassVideo message, Type typeOfSrc, JsonSerializationContext context) {
    JsonObject messageJson = new JsonObject();
    messageJson.addProperty("media_id", message.getMediaId());
    messageJson.addProperty("description", message.getDescription());
    messageJson.addProperty("title", message.getTitle());
    return messageJson;
  }
}
