package ru.elektr0ni3561.homework9.task1;

import ru.elektr0ni3561.homework9.task1.math.Calculator;
import ru.elektr0ni3561.homework9.task1.math.operation.MultiplyOperation;
import ru.elektr0ni3561.homework9.task1.math.operation.SubtractOperation;
import ru.elektr0ni3561.homework9.task1.math.operation.SumOperation;

public class Main1 {

    // Реализация паттерна стратегия. Клиент может поменять операция на нужную ему в любой момент и класс Calculator не будет знать об этом.
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new SumOperation());

        System.out.println("-----------------------------------------------");
        System.out.println("Sum operation 5 and 6 = " + calculator.calculate(5, 6));

        calculator.setOperation(new MultiplyOperation());

        System.out.println("Multiply operation 5 and 6 = " + calculator.calculate(5, 6));

        calculator.setOperation(new SubtractOperation());

        System.out.println("Subtract operation 5 and 6 = " + calculator.calculate(5, 6));
        System.out.println("-----------------------------------------------");
    }
}
