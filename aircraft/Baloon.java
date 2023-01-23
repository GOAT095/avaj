package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.tower.WeatherTower;

public class Baloon extends Aircraft implements Flayable {
    private WeatherTower weatherTower;

    @Override
    void fuckOff() {

    }

    public Baloon(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    @Override
    public void registerTower(WeatherTower weatherTower){

    }
    @Override
    public void updateConditions(){

    }
}
