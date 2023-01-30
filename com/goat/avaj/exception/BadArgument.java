package com.goat.avaj.exception;
//throwable so we can throw the exception
public class BadArgument extends java.lang.IllegalArgumentException {

    public BadArgument(java.lang.String string) {
        System.out.println(string);
    }
}