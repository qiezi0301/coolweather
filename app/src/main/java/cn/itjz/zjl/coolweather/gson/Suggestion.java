package cn.itjz.zjl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangjialiang on 17/3/18.
 */

public class Suggestion {

    /**
     * comf : {"brf":"较舒适","txt":"白天天气阴沉，会感到有点儿凉，但大部分人完全可以接受。"}
     * cw : {"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
     * sport : {"brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"}
     */

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
