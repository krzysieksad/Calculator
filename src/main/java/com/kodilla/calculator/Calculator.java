package com.kodilla.calculator;

public class Calculator {
    private void addition(final int addendA, final int addendB) {
        System.out.println("Addition of " + addendA + " and " + addendB + " equals " + (addendA + addendB));
    }
    private void subtraction(final int minuend, final int subtrahend) {
        System.out.println("Subtraction of " + subtrahend + " from " + minuend + " equals " + (minuend - subtrahend));
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addition(13, 15);
        calculator.subtraction(21, 32);
    }
}
