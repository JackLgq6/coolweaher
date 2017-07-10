package com.eg.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qiangge-pc on 2017/7/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }

}
