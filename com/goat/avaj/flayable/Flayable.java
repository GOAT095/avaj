package com.goat.avaj.flayable;

import com.goat.avaj.tower.WeatherTower;

public interface Flayable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
//    default void something()
//    {
//        System.out.println("something");
//    }


}
