package com.example.model;

import com.example.exception.IncorrectAgeException;
import com.example.exception.NameUndefinedException;


public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        isCorrectFirstName(firstName);
        isCorrectLastName(lastName);
        //checkParameters(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkParameters(String firstName, String lastName, int age) throws NameUndefinedException, IncorrectAgeException {
        if (!(isCorrectFirstName(firstName)) || !(isCorrectLastName(lastName))) {
            throw new NameUndefinedException("błędne dane");
        } else if (age < 1) {
            throw new IncorrectAgeException();
        }
    }

    public boolean isCorrectFirstName(String firstName){
        return firstName != null && firstName.length() > 2;
    }

    public boolean isCorrectLastName(String lastName) {
        return lastName != null && lastName.length() > 2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (!isCorrectFirstName(firstName)) {
            throw new NameUndefinedException("błędne imię");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (!isCorrectLastName(lastName)) {
            throw new NameUndefinedException("błędne nazwisko");
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException();
        } else {
            this.age = age;
        }

    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}