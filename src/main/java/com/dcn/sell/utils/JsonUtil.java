package com.dcn.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

/**
 * Created by 廖师兄
 * 2017-07-04 01:30
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

    public static String toJsonWeixin(Object obj) {
        return WxMpGsonBuilder.create().toJson(obj);
    }
}
