package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")   //JSON字段和Java字段建立映射:这个JSON有时候传的是fullName，有时候传的是name，这时该怎么办呢？ 不用担心，@SerializedName 接受两个参数，value 和 alternate ，顾名思义，alternate 是备选变量名,所以首先接受的参数是value
    public String cityName;   //城市名
    @SerializedName("id")
    public String weather_id;  //天气情况
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;   //天气更新时间
    }
}