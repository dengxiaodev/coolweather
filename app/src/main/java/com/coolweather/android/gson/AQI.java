package com.coolweather.android.gson;

/**
 * Created by Administrator on 2016/12/28 0028.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
