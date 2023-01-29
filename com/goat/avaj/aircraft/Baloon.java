package com.goat.avaj.aircraft;

import com.goat.avaj.WeatherProvider.WeatherProvider;
import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.WeatherProvider.WeatherTower;

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
        System.out.println("Tower says: Baloon#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
//    • Baloon:
//            ◦ SUN - Longitude increases with 2, Height increases with 4
//            ◦ RAIN - Height decreases with 5
//            ◦ FOG - Height decreases with 3
//            ◦ SNOW - Height decreases with 15
    @Override
    public void updateConditions(){

    }

    @Override
    public String toString() {
        return "Baloon#" + this.name + "(" +  this.id + ")";
    }
}
