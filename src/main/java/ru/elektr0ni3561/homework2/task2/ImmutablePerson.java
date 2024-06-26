package ru.elektr0ni3561.homework2.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, final List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = Collections.unmodifiableList(hobbies);
        //this.hobbies.add("Sport"); При попытке изменить список, код не скомпилируется с исключением UnsupportedOperationException
    }

    /* Нельзя изменить final поле.
    public void setName(String name) {
        this.name = name;
    }
     */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}