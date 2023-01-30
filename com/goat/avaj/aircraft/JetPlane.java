package com.goat.avaj.aircraft;

import com.goat.avaj.flayable.Flayable;
import com.goat.avaj.WeatherProvider.WeatherTower;

public class JetPlane extends Aircraft implements Flayable {
    private  WeatherTower weatherTower;
    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

//    @Override
//    void fuckOff() {
//
//    }
//    • JetPlane:
//            ◦ SUN - Latitude increases with 10, Height increases with 2
//            ◦ RAIN - Latitude increases with 5
//            ◦ FOG - Latitude increases with 1
//            ◦ SNOW - Height decreases with 7
    @Override
    public void updateConditions() {
        String WeatherNow = weatherTower.getWeather(this.coordinates);
        switch (WeatherNow) {
            case "SUN" -> {
                this.coordinates = new Coordinates(this.coordinates.getLongitude(), coordinates.getLatitude() + 10, this.coordinates.getHeight() + 2);
                System.out.println(this.toString() + " " + this.Sun[(int) (Math.random()*3)]);
            }
            case "RAIN" -> {
                this.coordinates = new Coordinates(this.coordinates.getLongitude(), coordinates.getLatitude() + 5, this.coordinates.getHeight());
                System.out.println(toString() + " " + this.Rain[(int) (Math.random()*3)]);
            }
            case "FOG" -> {
                this.coordinates = new Coordinates(this.coordinates.getLongitude(), coordinates.getLatitude() + 1, this.coordinates.getHeight());
                System.out.println(toString() + " " + this.Fog[(int) (Math.random()*3)]);
            }
            case "SNOW" -> {
                this.coordinates = new Coordinates(this.coordinates.getLongitude(), coordinates.getLatitude(), this.coordinates.getHeight() - 7);
                System.out.println(toString() + " " + this.Snow[(int) (Math.random()*3)]);
            }
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
        System.out.println("Tower says: JetPlane#" + this.name + "(" + this.id + ") registered to weather tower.");
    }

    @Override
    public String toString() {
        return "JetPlane#" + this.name + "(" +  this.id + ")";
    }
}
