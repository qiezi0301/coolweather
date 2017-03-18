package cn.itjz.zjl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangjialiang on 17/3/18.
 */

public class Now {

    /**
     * cond : {"txt":"晴"}
     * tmp : 12
     */

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
