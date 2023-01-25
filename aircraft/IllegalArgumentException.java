package com.goat.avaj.aircraft;
//throwable so we can throw the exception
public class IllegalArgumentException extends Throwable {

    public IllegalArgumentException(java.lang.String string) {
        System.out.println(string);
    }

}