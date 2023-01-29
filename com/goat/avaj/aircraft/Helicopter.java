package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.WeatherProvider.WeatherTower;

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
        String WeatherNow = weatherTower.getWeather(this.coordinates);
        switch (WeatherNow) {
            case "SUN" ->
                    this.coordinates = new Coordinates(this.coordinates.getLongitude() + 10, coordinates.getLatitude(), this.coordinates.getHeight() + 2);
            case "RAIN" ->
                    this.coordinates = new Coordinates(this.coordinates.getLongitude() + 5, coordinates.getLatitude(), this.coordinates.getHeight());
            case "FOG" ->
                    this.coordinates = new Coordinates(this.coordinates.getLongitude() + 1, coordinates.getLatitude(), this.coordinates.getHeight());
            case "SNOW" ->
                    this.coordinates = new Coordinates(this.coordinates.getLongitude(), coordinates.getLatitude(), this.coordinates.getHeight() - 12);
            default -> {
            }
        }
        if(this.coordinates.getHeight() > 100)
            this.coordinates.setHeight(100);
        if(coordinates.getHeight() <= 0){
            System.out.println(this.toString() + " is landing right now.");
            this.weatherTower.unregister(this);
            System.out.println("Tower says: " + this.toString() + " unregistered from weather tower.");
        }
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
