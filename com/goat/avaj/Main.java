package com.goat.avaj;


import com.goat.avaj.WeatherProvider.WeatherProvider;
import com.goat.avaj.WeatherProvider.WeatherTower;
import com.goat.avaj.aircraft.AircraftFactory;
import com.goat.avaj.flayable.Flayable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inFile = null;
        int NUpdates;
        WeatherTower weatherTower = new WeatherTower();
//        System.out.println(args.length);
        if ((args.length == 1)) {
            inFile = new File(args[0]);
        }
        else {
            System.err.println("Invalid arguments count: " + args.length);
            System.exit(1);
        }
        BufferedReader br = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(inFile));
            NUpdates = Integer.parseInt(br.readLine());
            if(NUpdates < 0) throw new java.io.IOException("bad argument !");
            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
                
                String[] splitted = sCurrentLine.split(" ");
              if(splitted.length == 5){
                Flayable f = new AircraftFactory().newAircraft(splitted[0], splitted[1] , Integer.parseInt(splitted[2]),
                        Integer.parseInt(splitted[3]), (Math.min(Integer.parseInt(splitted[4]), 100)));
//                System.out.println(f.toString());
                  f.registerTower(new WeatherTower());
                }
                else throw new IOException();
            }
            WeatherProvider weatherProvider = WeatherProvider.getProvider();
            for(int i = 0 ; i < NUpdates; i++)
                weatherTower.changeWeather();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        finally {
            try {
                if (br != null)br.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
}
}