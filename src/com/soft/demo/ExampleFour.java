package com.soft.demo;
import java.util.Scanner;

public class ExampleFour {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter u want to reverse :");
        String orginalString = userInput.nextLine();

        String reverse = "";
        for (int i = 0; i < orginalString.length(); i++) {
            reverse = orginalString.charAt(i) + reverse;
        }
        System.out.println("Your reverse input is " + reverse);

        userInput.close();
    }
}
