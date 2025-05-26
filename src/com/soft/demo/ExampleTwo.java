package com.soft.demo;

import java.util.Scanner;

public class ExampleTwo {
    public static void  main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean isLoop = true;
        while (isLoop){
            System.out.print("Please type number only: ");
            String userNumberInString = userInput.nextLine();

            if(userNumberInString.matches("[1-7]")){
                int day = Integer.parseInt(userNumberInString);

                String result = switch (day) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    default -> "Monday";
                };

                isLoop= false;
                System.out.println("Your input day is " + result);
            }else {
                System.out.println("Please enter between 1 to 7");
            }
        }

        userInput.close();
    }
}
