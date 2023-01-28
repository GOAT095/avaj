package com.goat.avaj.WeatherProvider;

import com.goat.avaj.aircraft.Coordinates;

public class WeatherProvider {
    private static WeatherProvider  weatherProvider;
    private static String[] weather;

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
    public String gerCurrentWeather(Coordinates coordinates){
        return coordinates.toString();
    }

}
