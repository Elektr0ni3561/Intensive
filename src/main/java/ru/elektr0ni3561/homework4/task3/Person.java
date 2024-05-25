package ru.elektr0ni3561.homework4.task3;

import java.util.Objects;

public class Person {
    private final String NAME;
    private final String LAST_NAME;

    public Person(String name, String lastName) {
        this.NAME = name;
        this.LAST_NAME = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(NAME, person.NAME) && Objects.equals(LAST_NAME, person.LAST_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, LAST_NAME);
    }

    @Override
    public String toString() {
        return "Person{" +
                "NAME='" + NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                '}';
    }

    public String getName() {
        return NAME;
    }

    public String getLastname() {
        return LAST_NAME;
    }
}
