package ru.elektr0ni3561.homework3.task3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        final int N = 3;
        final String[] arr = new String[N];
        final Scanner in = new Scanner(System.in);
        String str = "";

        System.out.println("Write 3 Strings:");

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
            String[] words = arr[i].split(" ");
            for (String word : words) {
                if (!word.matches("(.*)(.)(.*)\\2") && str.isEmpty()) {
                    str = word;
                }
            }
        }

        System.out.println("First word with different chars: \"" + str + "\"");
    }
}