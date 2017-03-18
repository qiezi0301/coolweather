package cn.itjz.zjl.coolweather.gson;

/**
 * Created by zhangjialiang on 17/3/18.
 */

public class AQI {

    /**
     * city : {"aqi":"55","pm25":"39"}
     */

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
