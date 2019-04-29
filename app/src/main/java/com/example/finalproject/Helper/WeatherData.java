package com.example.finalproject.Helper;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherData {

    private static String API_KEY = "cc80c0f8d55f20146739b594278507ec";
    private static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double arg) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) arg * 1000);
        return dateFormat.format(date);
    }

    public static String getImage(String toSearch) {
        return String.format("http://openweathermap.org/img/w/%s.png", toSearch);
    }

    public static String getDateNow() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM' yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }





}
