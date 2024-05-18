package ru.elektr0ni3561.homework2.task3;

public class Main3 {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer.Processor processor = new Computer.Processor("Ryzen 7 5800X3D");
        Computer.RAM RAM = computer.new RAM(16);

        System.out.println("------------------------------");
        System.out.println("Processor model: " + processor.getDetails());
        System.out.println("RAM size: " + RAM.getDetails());
        System.out.println("------------------------------");
    }
}
