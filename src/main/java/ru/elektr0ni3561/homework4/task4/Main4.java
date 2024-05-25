package ru.elektr0ni3561.homework4.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main4 {

    private static final List<Student> studentList = new ArrayList<Student>();
    private static final HashMap<Subject, List<Integer>> marks = new HashMap<>();
    //Вспомогательная переменная для создания студентовю. Можно было сделать функцию создающую случайные оценки, но я сделал так.

    public static void main(String[] args) {

        marks.put(Subject.LOGIC, Arrays.asList(new Integer[]{5, 3, 2, 5, 5, 5}));
        marks.put(Subject.DIFF_GEOM, Arrays.asList(new Integer[]{5, 2, 3, 4, 5}));
        marks.put(Subject.MATH_STATISTICS, Arrays.asList(new Integer[]{5, 5, 4, 3, 5}));

        studentList.add(new Student("Petr", 34, 1, marks));

        marks.put(Subject.LOGIC, Arrays.asList(new Integer[]{2, 3, 2, 2, 3, 3}));
        marks.put(Subject.DIFF_GEOM, Arrays.asList(new Integer[]{2, 2, 3, 2, 2}));
        marks.put(Subject.MATH_STATISTICS, Arrays.asList(new Integer[]{2, 2, 3, 3, 2}));

        studentList.add(new Student("Alex", 75, 3, marks));

        marks.put(Subject.LOGIC, Arrays.asList(new Integer[]{5, 5, 4, 5, 4, 4}));
        marks.put(Subject.DIFF_GEOM, Arrays.asList(new Integer[]{4, 3, 3, 4, 5}));
        marks.put(Subject.MATH_STATISTICS, Arrays.asList(new Integer[]{5, 4, 5, 4, 5}));

        studentList.add(new Student("Ivan", 75, 2, marks));

        System.out.println(studentList);

        printStudents(studentList, 2);
        printStudents(studentList, 3);

        nextCourseOrRemove();

        System.out.println(studentList);
    }

    private static void nextCourseOrRemove() {
        for (Student student : studentList) {
            if (averageMark(student) < 3.0f) {
                studentList.remove(student);
            } else {
                student.increaseCourse();
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    private static float averageMark(Student student) {
        float average = 0.0f;
        int n = 0;

        for (List<Integer> marks : student.getMarks().values()) {
            for (int mark : marks) {
                average += mark;
                n++;
            }
        }

        if (n != 0) {
            average = average / n;
        }
        return average;
    }
}
