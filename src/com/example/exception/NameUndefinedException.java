package com.example.exception;

public class NameUndefinedException extends RuntimeException{
    public NameUndefinedException() {
        super("Wprowadzono błędne imię lub nazwisko.");
    }
}
