package com.example.exception;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Podany wiek jest nieprawidłowy");
    }
}
