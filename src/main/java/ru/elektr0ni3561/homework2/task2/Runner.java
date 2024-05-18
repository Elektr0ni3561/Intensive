package ru.elektr0ni3561.homework2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner /*extends ImmutablePerson Нельзя унаследоваться*/ {

    public static void main(String[] args) {

        System.out.println("------------------------------");

        ImmutablePerson immutablePerson = new ImmutablePerson("Petya", 15, new ArrayList<>(List.of("Reading", "Dancing")));

        System.out.println("immutable Person name: " + immutablePerson.getName());
        System.out.println("immutable Person age: " + immutablePerson.getAge());
        System.out.println("immutable Person hobbies: " + immutablePerson.getHobbies());

        //immutablePerson.age = 5; Нет доступа.

        immutablePerson = new ImmutablePerson("Sasha", 14, new ArrayList<>(List.of("Singing"))); //Можем изменить ссылку, но не сам объект

        System.out.println("---------------");

        MutablePerson mutablePerson = new MutablePerson("Vanya", 17, new ArrayList<>(List.of("Sport", "Dancing")));

        System.out.println("mutable Person name: " + mutablePerson.getName());
        System.out.println("mutable Person age: " + mutablePerson.getAge());
        System.out.println("mutable Person hobbies: " + mutablePerson.getHobbies());
        System.out.println("---------------");

        mutablePerson.setName("Ivan");
        mutablePerson.setAge(18);
        mutablePerson.addHobbies(List.of("Swimming"));
        mutablePerson.deleteHobbies(List.of("Dancing"));

        System.out.println("mutable Person NEW name: " + mutablePerson.getName());
        System.out.println("mutable Person NEW age: " + mutablePerson.getAge());
        System.out.println("mutable Person NEW hobbies: " + mutablePerson.getHobbies());
        System.out.println("------------------------------");
    }
}
