package ru.elektr0ni3561.homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {

    private String name = "";
    private int age = 0;
    private List<String> hobbies;

    public MutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean addHobbies(List<String> hobbies) {
        return this.hobbies.addAll(hobbies);
    }

    public boolean deleteHobbies(List<String> hobbies) {
        return this.hobbies.removeAll(hobbies);
    }
}
