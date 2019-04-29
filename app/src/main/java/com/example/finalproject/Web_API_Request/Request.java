package com.example.finalproject.Web_API_Request;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Request {
    private static String stream = null;
    public Request() {}

    public String getHTTPData(String test) {
        try {
            URL url = new URL(test);
            HttpURLConnection whatever = (HttpURLConnection) url.openConnection();
            if (whatever.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(whatever.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                    stream = stringBuilder.toString();
                    whatever.disconnect();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }
}
