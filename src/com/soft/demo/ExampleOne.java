package com.soft.demo;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean isLoop = true;
        while (isLoop){
            System.out.print("Please type number only: ");
            String userNumberInString = userInput.nextLine();
            boolean isMatched = userNumberInString.matches("[+-]?[0-9]+");

            if(isMatched){
                int number = Integer.parseInt(userNumberInString);
                String result = number == 0 ? "Zero" : number < 0 ? "Negative" : "Positive";
                System.out.println("Your input is " + result);
                isLoop = false;
            }else {
                System.out.println("Please enter valid input");
            }
        }
        userInput.close();
    }
}
