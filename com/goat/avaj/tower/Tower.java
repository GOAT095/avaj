package com.goat.avaj.tower;

import com.goat.avaj.flayable.Flayable;

import java.util.ArrayList;
import java.util.List;
//observers design pattern
public class Tower{
    private List<Flayable> observers = new ArrayList<Flayable>();
    public void register(Flayable flayable){
        observers.add(flayable);
    }
    public  void unregister(Flayable flayable){
        observers.remove(flayable);
    }
    //not
    protected void conditionsChanged(){
        for(int i =0 ; i <observers.size(); i++)
            observers.get(i).updateConditions();
        }
//        observers.stream().forEach(Flayable::updateConditions);
    }

