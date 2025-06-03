package com.soft.myapp;

public class Day7 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.num1 = 10;
        calculator.num2 = 5;

        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.division();

        int addResult = calculator.addWithReturn(12, 13);
        int subtractResult = calculator.subtractWithReturn(10, 5);
        int multiplyResult = calculator.multiplyWithReturn(5, 2);
        int divideResult = calculator.divisionWithReturn(10, 5);

        System.out.printf("Add value is %d \nSubtractValue is %d \nMultiple Value is %d \nDivide Value is %d", addResult, subtractResult, multiplyResult, divideResult);

        UserAccount userAccount = new UserAccount();
        UserAccount userAccount1 =  new UserAccount("1234", "12345", 222.22, true);

        System.out.println("userAccount :" + userAccount.accountStatus);
        System.out.println("userAccount1 : " + userAccount1.accountStatus);
    }
}
