package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.tower.WeatherTower;

public class Baloon extends Aircraft implements Flayable {
    private WeatherTower weatherTower;

//    @Override
//    void fuckOff() {
//
//    }

    public Baloon(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    @Override
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        
    }
    @Override
    public void updateConditions(){

    }

    @Override
    public String toString() {
        return "Baloon#" + this.name + "(" +  this.id + ")";
    }
}
