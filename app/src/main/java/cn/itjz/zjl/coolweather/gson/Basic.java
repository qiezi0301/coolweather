package cn.itjz.zjl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangjialiang on 17/3/18.
 */

public class Basic {

    /**
     * city : 苏州
     * cnty : 中国
     * id : CN101190401
     * lat : 31.309000
     * lon : 120.612000
     * update : {"loc":"2017-03-18 15:51","utc":"2017-03-18 07:51"}
     */

    //注解的方式建立与JSON映射
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
