package com.example.main;

import com.example.controller.Input;
import com.example.exception.IncorrectAgeException;
import com.example.exception.NameUndefinedException;

public class Main {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        try {
            System.out.println(Input.getPersonFromUser());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }

    }
}
