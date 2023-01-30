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
    protected Coordinates coordinates;

    String [] Snow = {"bitch im freezing", "this shit cold asf !", "brrrrrrrr !"};
    String [] Sun = {"great weather !", "hot as fuck boy", ":-) !"};
    String [] Fog = {"foggy today huh !", "cant see shit !", "idk whats in front but im going!"};
    String [] Rain = {"this makes me sad !", "its raining bullets !", "Dido !"};
//    abstract void fuckOff();
    public Aircraft(String name, Coordinates coordinates) {
        this.id = nextId();
        this.name = name;
        this.coordinates = coordinates;
    }
//    public Aircraft(long id)
//    {
//        this("", new Coordinates(1, 1, 1))
//    }
    private long nextId()
    {
        return ++Aircraft.idCounter;
    }
//    private Coordinates getCoordinates(){
//        return this.coordinates;
//    }
    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
