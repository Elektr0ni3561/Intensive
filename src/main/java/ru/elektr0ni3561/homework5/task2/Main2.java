package ru.elektr0ni3561.homework5.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(createListOfEmployee());

        System.out.println("------------------------------------");
        System.out.println("List of employees over 30 years old, sorted by age: " + sortedListOfAge(30, employees));
        System.out.println("IT department has " + countIT(employees) + " employees");
        System.out.println("Max salary have: " + maxSalary(employees).orElseThrow());
        System.out.println("List of HRs, sorted by name: " + sortedListOfHR(employees));
        System.out.println("Average salary = " + averageSalary(employees));
        System.out.println("------------------------------------");
    }

    //По харошему, лучше вынести методы в отдельный класс

    private static List<Employee> createListOfEmployee() {
        Stream.Builder<Employee> builder = Stream.builder();
        return builder
                .add(new Employee("Vasili", 34, Department.HR, 100000))
                .add(new Employee("Ivan", 30, Department.IT, 120000))
                .add(new Employee("Alex", 32, Department.FINANCE, 80000))
                .add(new Employee("Natalia", 41, Department.MARKETING, 100000))
                .add(new Employee("Bill", 39, Department.MARKETING, 90000))
                .add(new Employee("Jon", 35, Department.FINANCE, 85000))
                .add(new Employee("Cris", 34, Department.IT, 125000))
                .add(new Employee("Petr", 42, Department.IT, 150000))
                .add(new Employee("Anjela", 28, Department.IT, 100000))
                .add(new Employee("Victoria", 27, Department.FINANCE, 90000))
                .add(new Employee("Andrey", 25, Department.IT, 100000))
                .add(new Employee("Ivan", 23, Department.IT, 85000))
                .add(new Employee("Mary", 33, Department.HR, 85000))
                .build()
                .collect(Collectors.toList());
    }

    private static List<Employee> sortedListOfAge(final int age, final List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getAge() > age)
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
    }

    private static Long countIT(final List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(Department.IT))
                .count();
    }

    private static Optional<Employee> maxSalary(final List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
    }

    private static List<String> sortedListOfHR(final List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(Department.HR))
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    private static float averageSalary(final List<Employee> employees) {
        return (float) employees.stream()
                .map(Employee::getSalary)
                .reduce(0, Integer::sum) / employees.size();
    }
}
