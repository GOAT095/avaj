package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.tower.WeatherTower;

public class Helicopter extends Aircraft implements Flayable {
    private WeatherTower weatherTower;

//    @Override
//    void fuckOff() {
//
//    }

    Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);
    }
//    • Helicopter:
//            ◦ SUN - Longitude increases with 10, Height increases with 2
//            ◦ RAIN - Longitude increases with 5
//            ◦ FOG - Longitude increases with 1
//            ◦ SNOW - Height decreases with 12
    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        System.out.println("Tower says: Helicopter#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
//    @Override
//    public void something()
//    {
//
//    }
    @Override
    public String toString() {
        return "Helicopter#" + this.name + "(" +  this.id + ")";
    }

}
