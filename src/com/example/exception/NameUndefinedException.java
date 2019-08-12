package com.example.exception;

public class NameUndefinedException extends Exception{
    public NameUndefinedException(String errorMessage) {
        super(errorMessage);
    }
}