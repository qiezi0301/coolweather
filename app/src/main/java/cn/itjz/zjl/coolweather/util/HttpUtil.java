package cn.itjz.zjl.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**网络请求工具类
 * Created by zhangjialiang on 17/3/18.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
