package com.example.controller;

import com.example.exception.IncorrectAgeException;
import com.example.exception.NameUndefinedException;
import com.example.model.Person;

import java.util.Scanner;

public class Input {

    public static Person getPersonFromUser(Scanner input) throws NameUndefinedException, IncorrectAgeException {
        System.out.println("Podaj dane osoby");
        System.out.println("imie");
        String firstName = input.nextLine();
        System.out.println("nazwisko");
        String lastName = input.nextLine();
        System.out.println("wiek");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("pesel");
        String pesel = input.nextLine();
        return new Person(firstName, lastName, age, pesel);
    }
}
