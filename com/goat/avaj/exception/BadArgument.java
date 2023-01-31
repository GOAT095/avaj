package com.goat.avaj.exception;
//throwable so we can throw the exception
public class BadArgument extends java.lang.IllegalArgumentException {

    public BadArgument(java.lang.String errorMessage) {
        super(errorMessage);
    }
}
