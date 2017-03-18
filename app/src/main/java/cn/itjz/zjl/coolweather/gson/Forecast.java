package cn.itjz.zjl.coolweather.gson;

import com.google.gson.annotations.SerializedName;


public class Forecast {

    /**
     * date : 2017-03-18
     * cond : {"txt_d":"阴"}
     * tmp : {"max":"13","min":"9"}
     */


    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
