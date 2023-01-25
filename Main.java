package com.goat.avaj;

import com.goat.avaj.aircraft.AircraftFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File inFile = null;
        System.out.println(args.length);
        if ((args.length == 1)) {
            inFile = new File(args[0]);
        }
        else {
            System.err.println("invalide arguments count: " + args.length);
            System.exit(0);
        }
        BufferedReader br = null;
        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader(inFile));
            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
                String[] splitted = sCurrentLine.split(" ");
//                for(String s : splitted )
//                    System.out.println(s);
                AircraftFactory aircraftFactory = new AircraftFactory();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null)br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        File inFile = null;
//
//        StringBuilder sb = new StringBuilder();
//        for (String s: args)
//            sb.append(String.format("%s\n", s));
//        System.out.println(sb);

//        sb.append(123);
//        sb.append(
//                12.123
//        );
//        sb.append("asdf", 0, 3);
//
//
//        System.out.println(sb);

    }

}