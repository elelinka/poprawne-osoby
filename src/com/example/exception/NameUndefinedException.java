package com.example.exception;

public class NameUndefinedException extends Exception{
    public NameUndefinedException() {
        super("Wprowadzono błędne imię lub nazwisko.");
    }
}
