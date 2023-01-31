package com.goat.avaj.aircraft;

public class Randomizer {
    public Randomizer(){}
    public static int generate(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
