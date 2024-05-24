package ru.elektr0ni3561.homework3.task4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        System.out.println("Write 1 String:");
        System.out.println("New string: " + in.nextLine().replaceAll("([A-Za-z])", "$1$1")); //Do not work with cyrillic, throw exception
    }
}