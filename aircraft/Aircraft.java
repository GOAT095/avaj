package com.goat.avaj.aircraft;

/*
    - private ;
    # protected
    + public
     some
     _____  some is static
 */
public class Aircraft {
     protected long id ; // auto generated (not included in uml constructor)
     protected String name;

    static long idCounter;
    private Coordinates coordinates;

    public Aircraft(String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }
//    public Aircraft(long id)
//    {
//        this("", new Coordinates(1, 1, 1))
//    }
}
