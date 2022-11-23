package ru.skillbox;

public class ArithmeticCalculator {

    private static int numberOne;
    private static int numberTwo;
    public final Operation operation;

    public ArithmeticCalculator(int numberOne, int numberTwo, Operation operation) {
        this.operation = operation;
        ArithmeticCalculator.numberOne = numberOne;
        ArithmeticCalculator.numberTwo = numberTwo;
    }

    public Operation getOperation() {
        return operation;
    }

    public int calculate() {
        return switch (getOperation()) {
            case ADD -> numberOne + numberTwo;
            case SUBSTRACT -> numberOne - numberTwo;
            case MULTIPLY -> numberOne * numberTwo;
        };
    }
}
