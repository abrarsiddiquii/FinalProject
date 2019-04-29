package com.example.finalproject.Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherData {

    private static String API_KEY = "cc80c0f8d55f20146739b594278507ec";
    private static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

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
