package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.tower.WeatherTower;

public class Helicopter extends Aircraft implements Flayable {
    private WeatherTower weatherTower;

    @Override
    void fuckOff() {

    }

    Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);

    }

    @Override
    public void updateConditions() {

    }
    @Override
    public void something()
    {

    }
    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
