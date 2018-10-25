package com.example.administrator.windyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018-10-23.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
