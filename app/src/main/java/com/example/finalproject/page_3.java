package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finalproject.Model.Sys;

import java.util.ArrayList;
import java.util.List;

public class page_3 extends AppCompatActivity {
    public static String[][] wild = new String[5][2];

    public static TextView res;
    public static TextView intensity;

    public void setWildValues() {
        wild[0][0] = "Hiking";
        wild[0][1] = "3";
        wild[1][0] = "Camping";
        wild[1][1] = "3";
        wild[2][0] = "Hunting";
        wild[2][1] = "5";
        wild[3][0] = "Dirt Biking";
        wild[3][1] = "4";

    }

    public void printWild(String[][] array) {
        res = (TextView) findViewById(R.id.activities);
        res.setText(array[0][0] + "\n" + array[1][0] + "\n" + array[2][0] + "\n" + array[3][0]);
        intensity = findViewById(R.id.intensity);
        intensity.setText(array[0][1] + "\n" + array[1][1] + "\n" + array[2][1] + "\n" + array[3][1]);
    }

    public static String[][] winter = new String[8][2];

    public static void setWinterValues() {
        winter[0][0] = "Sledding";
        winter[0][1] = "2";
        winter[1][0] = "Skiing";
        winter[1][1] = "3";
        winter[2][0] = "Snowball Fight";
        winter[2][1] = "1";
        winter[3][0] = "Ice Skating";
        winter[3][1] = "3";
        winter[4][0] = "Snowboarding";
        winter[4][1] = "4";
        winter[5][0] = "Ice Hockey";
        winter[5][1] = "4";
        winter[6][0] = "Ice Fishing";
        winter[6][1] = "2";
        winter[7][0] = "Hot Chocolate & a Book Inside";
        winter[7][1] = "1";
    }

    public void printWinter(String[][] array) {
        res = (TextView) findViewById(R.id.activities);
        res.setText(array[0][0] + "\n" + array[1][0] + "\n" + array[2][0] + "\n" + array[3][0] + array[4][0] + "\n" + array[5][0] + "\n" + array[6][0] + "\n" + array[7][0]);
        intensity = findViewById(R.id.intensity);
        intensity.setText(array[0][1] + "\n" + array[1][1] + "\n" + array[2][1] + "\n" + array[3][1] + "\n" + array[4][1] + "\n" + array[5][1] + "\n" + array[6][1] + "\n" + array[7][1]);
    }

    public static String[][] OutdoorSports = new String[8][2];

    public static void setOutdoorSportsValues() {
        OutdoorSports[0][0] = "Watching a Football Game!";
        OutdoorSports[0][1] = "1";
        OutdoorSports[1][0] = "Playing Baseball";
        OutdoorSports[1][1] = "3";
        OutdoorSports[2][0] = "Playing Soccer";
        OutdoorSports[2][1] = "3";
        OutdoorSports[3][0] = "Playing Golf";
        OutdoorSports[3][1] = "2";
        OutdoorSports[4][0] = "Playing Outdoor Basketball";
        OutdoorSports[4][1] = "3";
        OutdoorSports[5][0] = "Playing Tennis";
        OutdoorSports[5][1] = "2";
        OutdoorSports[6][0] = "Skateboarding";
        OutdoorSports[6][1] = "3";
        OutdoorSports[7][0] = "Playing Rugby";
        OutdoorSports[7][1] = "4";
    }

    public void printOutdoorSports(String[][] array) {
        res = (TextView) findViewById(R.id.activities);
        res.setText(array[0][0] + "\n" + array[1][0] + "\n" + array[2][0] + "\n" + array[3][0] + array[4][0] + "\n" + array[5][0] + "\n" + array[6][0] + "\n" + array[7][0]);
        intensity = findViewById(R.id.intensity);
        intensity.setText(array[0][1] + "\n" + array[1][1] + "\n" + array[2][1] + "\n" + array[3][1] + "\n" + array[4][1] + "\n" + array[5][1] + "\n" + array[6][1] + "\n" + array[7][1]);
    }

    public static String[][] water = new String[8][2];

    public static void setWaterValues() {
        water[0][0] = "Swimming at the Beach";
        water[0][1] = "2";
        water[1][0] = "Building a sandcastle";
        water[1][1] = "1";
        water[2][0] = "Surfing Some Waves";
        water[2][1] = "4";
        water[3][0] = "Playing Beach Volleyball";
        water[3][1] = "3";
        water[4][0] = "Parasailing";
        water[4][1] = "3";
        water[5][0] = "Snorkeling";
        water[5][1] = "2";
        water[6][0] = "Waterskiing";
        water[6][1] = "4";
        water[7][0] = "Outdoor Waterpark";
        water[7][1] = "2";
    }

    public void printWater(String[][] array) {
        res = (TextView) findViewById(R.id.activities);
        res.setText(array[0][0] + "\n" + array[1][0] + "\n" + array[2][0] + "\n" + array[3][0] + array[4][0]);
        intensity = findViewById(R.id.intensity);
        intensity.setText(array[0][1] + "\n" + array[1][1] + "\n" + array[2][1] + "\n" + array[3][1] + "\n" + array[4][1]);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button setWild = findViewById(R.id.wild);
        setWild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWildValues();
                printWild(wild);
            }
        });

        Button setWinter = findViewById(R.id.winter);
        setWinter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWinterValues();
                printWinter(winter);
            }
        });

        Button setOutdoor = findViewById(R.id.outdoor);
        setOutdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOutdoorSportsValues();
                printOutdoorSports(OutdoorSports);
            }
        });

        Button setWater = findViewById(R.id.water);
        setWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWaterValues();
                printWater(water);
            }
        });
    }
}
