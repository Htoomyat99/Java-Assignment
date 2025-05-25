package com.soft.demo;

public class ExampleFive {
    public static void main(String[] args) {

        int[] myNum = {12,7,5,8,19,24,6};
        int totalOddSum = 0;
        int totalEvenSum = 0;
        for(int i = 0; i < myNum.length; i++){
            if(myNum[i] % 2 == 0){
                totalEvenSum += myNum[i];
            }else {
                totalOddSum += myNum[i];
            }
        }
        System.out.printf("Total Odd is %d and Total Even is %d", totalOddSum, totalEvenSum);
    }
}
