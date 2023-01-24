package com.goat.avaj.tower;

import com.goat.avaj.flayable.Flayable;

import java.util.ArrayList;
import java.util.List;
//observers design pattern
public class Tower{
    private List<Flayable> observers = new ArrayList<Flayable>();
    public void register(Flayable flayable){
        observers.add(flayable);
        System.out.println("Tower says: " + flayable.toString() + "registered to weather tower");
    }
    public  void unregister(Flayable flayable){
        observers.remove(flayable);
    }
    //not
    protected void conditionsChanged(){
        for(Flayable f: observers){
            f.updateConditions();
        }
//        observers.stream().forEach(Flayable::updateConditions);
    }
}
