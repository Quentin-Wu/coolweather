package com.example.wuguoting.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wu.guoting on 2019/2/18.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String adress, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
