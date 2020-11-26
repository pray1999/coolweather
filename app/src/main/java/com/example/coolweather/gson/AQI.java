package com.example.coolweather.gson;
//空气质量指数（Air Quality Index，简称AQI），简单来说就是能够对空气质量进行定量描述的数据。
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}