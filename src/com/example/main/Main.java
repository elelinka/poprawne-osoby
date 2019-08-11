package com.example.main;

import com.example.controller.Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Input.getPersonFromUser(input));
    }
}
