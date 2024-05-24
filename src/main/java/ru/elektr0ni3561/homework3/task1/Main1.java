package ru.elektr0ni3561.homework3.task1;

import java.util.Scanner;


public class Main1 {

    public static void main(String[] args) {

        final int N = 3;
        final String[] arr = new String[N];
        final Scanner in = new Scanner(System.in);
        int indexMin = 0;
        int indexMax = 0;

        System.out.println("Write 3 Strings:");

        arr[0] = in.nextLine();

        int min = arr[0].length();
        int max = arr[0].length();

        for (int i = 1; i < N; i++) {
            arr[i] = in.nextLine();
            if (arr[i].length() >= max) {
                max = arr[i].length();
                indexMax = i;
            } else if (arr[i].length() < min) {
                min = arr[i].length();
                indexMin = i;
            }
        }

        System.out.println("The shortest string: \"" + arr[indexMin] + "\", with length = " + min);
        System.out.println("The longest string: \"" + arr[indexMax] + "\", with length = " + max);
    }
}