package com.example.main;

import com.example.controller.Input;
import com.example.exception.IncorrectAgeException;
import com.example.exception.NameUndefinedException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner input = new Scanner(System.in);

        System.out.println(Input.getPersonFromUser(input));
    }
}
