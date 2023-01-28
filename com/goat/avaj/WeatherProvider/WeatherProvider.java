package com.goat.avaj.WeatherProvider;

import java.util.Random;
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
        Random rand = new Random();
        int x = rand.nextInt(4) + 1;
        return weather[x];
    }

}
