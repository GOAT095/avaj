package com.goat.avaj;


import com.goat.avaj.WeatherProvider.WeatherProvider;
import com.goat.avaj.WeatherProvider.WeatherTower;
import com.goat.avaj.aircraft.AircraftFactory;
import com.goat.avaj.exception.BadArgument;
import com.goat.avaj.flayable.Flayable;

import java.io.*;

public class Simulation {
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
            File file = new File("simulation.txt");
            PrintStream stream = new PrintStream(file);
            System.setOut(stream);
            String sCurrentLine;
            br = new BufferedReader(new FileReader(inFile));
            NUpdates = Integer.parseInt(br.readLine());
            if(NUpdates <= 0) throw new IOException("number needs to be positive ! ==>" + NUpdates);
            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
                String[] splitted = sCurrentLine.split(" ");
                if(splitted.length == 5 && Integer.parseInt(splitted[2]) > 0 &&
                        Integer.parseInt(splitted[3]) > 0 && Integer.parseInt(splitted[4]) > 0){
                    Flayable f = new AircraftFactory().newAircraft(splitted[0], splitted[1] , Integer.parseInt(splitted[2]),
                            Integer.parseInt(splitted[3]), (Math.min(Integer.parseInt(splitted[4]), 100)));
//                System.out.println(f.toString());
                    f.registerTower(weatherTower);
                }
                else throw new BadArgument("must be a set of 5 arguments with positive coordinates !");
            }
            WeatherProvider weatherProvider = WeatherProvider.getProvider();
            for(int i = 0 ; i < NUpdates; i++)
                weatherTower.changeWeather();
        }
        catch (IOException e) {
            throw new BadArgument("Invalid input " + e);

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