package com.example.administrator.windyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018-10-23.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updataTime;
    }
}
