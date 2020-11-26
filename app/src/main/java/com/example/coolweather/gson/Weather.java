package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;  //返回是否成功返回值
    public Basic basic;
    public Suggestion suggestion;
    public AQI aqi;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;  //解析出数组
}