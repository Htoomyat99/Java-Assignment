package com.soft.myapp;

public class Calculator {
    public int num1;
    public int num2;

    public void add() {
        int result = num1 + num2;
        System.out.println("Addition is " + result);
    }

    public void subtract() {
        int result = num1 - num2;
        System.out.println("Subtract is " + result);
    }

    public void multiply() {
        int result = num1 * num2;
        System.out.println("Multiply is " + result);
    }

    public void division() {
        int result = num1 / num2;
        System.out.println("Division is " + result);
    }

    public int addWithReturn(int a, int b) {
        return a + b;
    }

    public int subtractWithReturn(int a, int b) {
        return a - b;
    }

    public int multiplyWithReturn(int a, int b) {
        return a * b;
    }

    public int divisionWithReturn(int a, int b) {
        return a / b;
    }
}
