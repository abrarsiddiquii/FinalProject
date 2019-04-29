package com.example.finalproject.Model;

import java.util.List;

public class OpenWeatherMap {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int id;
    private String name;
    private int cod;

    public OpenWeatherMap() { }

    public OpenWeatherMap(Coord coord, List<Weather> weather, String base, Main main, Wind wind, Clouds clouds, int dt, Sys sys, int id, String name, int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }


}
