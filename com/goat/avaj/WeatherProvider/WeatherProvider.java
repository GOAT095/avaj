package com.goat.avaj.WeatherProvider;

import com.goat.avaj.aircraft.Coordinates;

public class WeatherProvider {
    private static WeatherProvider  weatherProvider;
    private static String[] weather = {"RAIN","FOG","SUN","SNOW"};

//    static {
//        weather = new String[]{"adsf", "asdf"};
//    }
    private WeatherProvider()
    {

    }

    public static WeatherProvider getProvider()
    {
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();

        return weatherProvider;
    }
    public String getCurrentWeather(Coordinates coordinates){
        //some randomizer 1 to be added
        //needs to be changed later !
        return weather[(coordinates.getLongitude() > 10 ? 1 : 0) + (coordinates.getLatitude() > 5 ? 1 : 0) + (coordinates.getHeight() > 2 ? 1: 0)];
    }

}
