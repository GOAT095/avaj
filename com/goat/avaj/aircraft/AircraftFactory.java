package com.goat.avaj.aircraft;

import com.goat.avaj.exception.BadArgument;
import com.goat.avaj.flayable.Flayable;

//factory design pattern
public class AircraftFactory {
    private static AircraftFactory instance;
    public static AircraftFactory getInstance() {
        if (instance == null) {
            instance = new AircraftFactory();
        }
        return instance;
    }
    private AircraftFactory() {
    }

    public Flayable newAircraft(String type, String name, int longitude, int latitude, int height) {
        if (type == null)
            return null;
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        try {
            switch (type) {
                case "Helicopter":
                    return new Helicopter(name, coordinates);
                case "JetPlane":
                    return new JetPlane(name, coordinates);
                case "Baloon":
                    return new Baloon(name, coordinates);
                default:
                    throw new BadArgument("Unknown Aircraft Type " + type);
            }
        } catch (BadArgument e) {
            throw new RuntimeException(e);
        }
    }
}