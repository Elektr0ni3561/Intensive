package ru.elektr0ni3561.homework4.task3;

import java.util.HashSet;

public class Main3 {

    private static final HashSet<Person> personsSet = new HashSet<>();

    public static void main(String[] args) {
        personsSet.add(new Person("Bill", "Gates"));
        personsSet.add(new Person("Steve", "Jobs"));
        personsSet.add(new Person("Linus", "Torvalds"));

        for (Person person : personsSet) {
            System.out.println(person);
        }

        personsSet.remove(new Person("Bill", "Gates"));
        personsSet.remove(new Person("Steve", "Jobs"));

        System.out.println("Contains person \"Linus Torvalds\": " + personsSet.contains(new Person("Linus", "Torvalds")));
    }
}
