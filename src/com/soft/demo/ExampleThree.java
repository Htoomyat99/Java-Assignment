package com.soft.demo;

public class ExampleThree {
    public static void main (String[] args) {
        int[] numbers = {3, 9, 2, 5, 6};
        int largetNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            if (currentNum > largetNum) {
                largetNum = currentNum;
            }
        }

        System.out.println(largetNum);
    }
}
