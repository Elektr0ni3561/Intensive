package ru.elektr0ni3561.homework9.task1.math;

import ru.elektr0ni3561.homework9.task1.math.operation.MathOperation;

public class Calculator {
    private MathOperation operation;

    public Calculator(final MathOperation operation) {
        this.operation = operation;
    }

    public void setOperation(final MathOperation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b) {
        return this.operation.calc(a, b);
    }
}
