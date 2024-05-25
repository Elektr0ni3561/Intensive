package ru.elektr0ni3561.homework4.task1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<String> countryList = new ArrayList<String>();

        countryList.add("Russia");
        countryList.add("Germany");
        countryList.add("Italy");
        System.out.println("List of 3 countries: " + countryList);

        countryList.set(1, "Spain");
        System.out.println("Change 2nd element by index: " + countryList);

        countryList.remove(1);
        System.out.println("Remove 2nd element by index" + countryList);

        countryList.remove("Italy");
        System.out.println("Remove element \"Italy\": " + countryList);

        System.out.println("Index of element \"Russia\": " + countryList.indexOf("Russia"));
        System.out.println("Does the list contain an element \"Germany\"?: " + countryList.contains("Germany"));
    }
}
