package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator calculator=new ArithmeticCalculator(5,6, Operation.ADD);
        System.out.println(calculator.calculate());
    }
}

