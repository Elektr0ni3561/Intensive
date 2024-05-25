package ru.elektr0ni3561.homework4.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private final String NAME;
    private int group;
    private int course;
    private final HashMap<Subject, List<Integer>> marksMap = new HashMap<>();
    // Лист оценок по названию предмета. Может я не совсем правильно понял, что именно значит "оценки по предметам".

    public Student(String NAME, int group, int course, final HashMap<Subject, List<Integer>> map) {
        this.NAME = NAME;
        this.group = group;
        this.course = course;
        this.marksMap.putAll(map);
    }

    @Override
    public String toString() {
        return "Student{" +
                "NAME='" + NAME + '\'' +
                ", group=" + group +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return NAME;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void increaseCourse() {
        this.course++;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public HashMap<Subject, List<Integer>> getMarks() {
        return marksMap;
    }

    public void setMarks(HashMap<Subject, List<Integer>> marksMap) {
        this.marksMap.putAll(marksMap);
    }
}
