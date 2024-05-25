package ru.elektr0ni3561.homework4.task2;

import java.util.LinkedList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<String> countryList = new LinkedList<String>();

        countryList.addFirst("Russia");
        countryList.addFirst("Germany");
        countryList.addLast("Italy");
        countryList.addLast("Spain");
        System.out.println("List of countries: " + countryList);

        countryList.removeFirst();
        countryList.removeLast();
        System.out.println("Remove from list first and last elements: " + countryList);

        System.out.println("First element: " + countryList.getFirst());
        System.out.println("Last element: " + countryList.getLast());
    }
}
