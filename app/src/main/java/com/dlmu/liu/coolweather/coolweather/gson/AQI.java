package com.dlmu.liu.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/4.
 */

public class AQI {

    public City city;

    public class City{

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
