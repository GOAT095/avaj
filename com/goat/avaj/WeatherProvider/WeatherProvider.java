package com.goat.avaj.WeatherProvider;

import com.goat.avaj.aircraft.Coordinates;

public class WeatherProvider {
    private static WeatherProvider  weatherProvider;

    private static String[] weather = {"RAIN","FOG","SUN","SNOW"};
    private WeatherProvider()
    {

    }
    //singleton
    public static WeatherProvider getProvider()
    {
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();

        return weatherProvider;
    }
    public String getCurrentWeather(Coordinates coordinates){
        //some randomizer 1 to be added
        //needs to be changed later !
        int longti = (int) (coordinates.getLongitude() * Math.random() * 5) % 2;
        int lati = (int) (coordinates.getLatitude() * Math.random() * 5) % 2;
        int hei = (int) (coordinates.getHeight() * Math.random() * 5) % 2;
        if(longti + lati + hei >= 4)
            throw new RuntimeException("bad weather !");
        return weather[longti + lati + hei];
    }

}
