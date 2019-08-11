package com.example.exception;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException() {
        super("Podany wiek jest nieprawidłowy");
    }
}
