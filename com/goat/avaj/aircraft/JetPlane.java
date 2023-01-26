package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.tower.WeatherTower;

public class JetPlane extends Aircraft implements Flayable {
    private  WeatherTower weatherTower;
    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

//    @Override
//    void fuckOff() {
//
//    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }

    @Override
    public String toString() {
        return "JetPlane#" + this.name + "(" +  this.id + ")";
    }
}
