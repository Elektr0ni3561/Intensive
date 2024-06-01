package ru.elektr0ni3561.homework6.task2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        final File file = new File("src/main/resources/tms.txt");

        try {
            System.out.println("------------------------------");
            System.out.println("Write a string to file: ");

            writeFile(file);

            System.out.println("Read a string from file and change all spaces with '_': ");

            readFile(file);
            System.out.println("------------------------------");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile(File file) throws IOException {
        final OutputStream out = new FileOutputStream(file);

        out.write(new Scanner(System.in).nextLine().getBytes());
        out.close();
    }

    private static void readFile(File file) throws IOException {
        final InputStream in = new FileInputStream(file);
        int i;

        while ((i = in.read()) != -1) {
            char c = (char) i;
            System.out.print(c == ' ' ? '_' : c);
        }
        System.out.print("\n");
        in.close();
    }
}