package com.example.controller;

import com.example.exception.IncorrectAgeException;
import com.example.exception.NameUndefinedException;
import com.example.model.Person;

import java.util.Scanner;

public class Input {
    private static Person person;

    public static Person getPersonFromUser() throws NameUndefinedException, IncorrectAgeException {
        String firstName = null;
        String lastName = null;
        int age;

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj dane osoby");
            System.out.println("imie");
            firstName = input.nextLine();
            System.out.println("nazwisko");
            lastName = input.nextLine();
            System.out.println("wiek");
            age = input.nextInt();
            input.nextLine();
            System.out.println("pesel");
            String pesel = input.nextLine();
            return new Person(firstName, lastName, age, pesel);
        } catch (NullPointerException e) {
            if (!(person.isCorrectLastName(lastName))) {
                System.err.println("Wprowadzono błędne nazwisko: " + lastName);
            } else if (!(person.isCorrectFirstName(firstName))) {
                System.err.println("Wprowadzono błędne imię: " + firstName);
            }
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
        return person;
    }
}