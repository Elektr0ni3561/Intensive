package ru.elektr0ni3561.homework3.task2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        final int N = 3;
        final String[] arr = new String[N];
        final Scanner in = new Scanner(System.in);
        float average = 0;

        System.out.println("Write 3 Strings:");

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
            average += arr[i].length();
        }

        average = average / N;

        System.out.println("Strings with length less than average:");
        for (String str : arr) {
            if (str.length() < average) {
                System.out.println("\"" + str + "\" and length = " + str.length());
            }
        }
    }
}