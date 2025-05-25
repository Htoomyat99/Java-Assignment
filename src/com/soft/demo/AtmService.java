package com.soft.demo;
import java.util.Scanner;

public class AtmService {
    //declare variable
    public static double initialBalance = 100_000.00;
    public static final int attempt = 3;
    public static final String currentPassword = "1234";

    public static void withdrawCash() {
        Scanner userInput = new Scanner(System.in);

       int i = 0;
       do {
           System.out.print("Please enter withdraw amount: ");
           String amount = userInput.nextLine();
           boolean isMatched = amount.matches("[1-9][0-9]*");

           if (isMatched) {
               int amountInteger = Integer.parseInt(amount);
               if (amountInteger > initialBalance) {
                   System.out.println("You do not have enough balance to withdraw, please try again!");
               } else {
                   double  result = initialBalance - amountInteger;
                   initialBalance = result;
                   System.out.printf("Withdraw Succeed. Your remaining balance is %.2f MMK \n", result);
               }
               i+= 1001;
           } else {
               System.out.println("Please enter valid amount");
               i++;
           }
       }while (i < 1000);
    }

    public static void showAtmMenu() {
        Scanner userInput = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("==== My Bank Menu ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Exit \n");
            System.out.print("Enter No: ");
            String functionName = userInput.nextLine();

            boolean isMatched = functionName.matches("[1-3]");
            if (isMatched) {
                switch (functionName) {
                    case "1":
                        System.out.printf("Your current balance is %.2f MMK \n", initialBalance);
                        i++;
                        break;
                    case "2":
                        withdrawCash();
                        i++;
                        break;
                    default:
                        System.out.println("Thank you for using our service");
                        i += 1001;
                }

            } else {
                System.out.println("Invalid input! Please enter between 1 to 3");
                i++;
            }
        } while (i < 1000);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int i = 0;
        do {
            System.out.print("Enter your password : ");
            String password = userInput.nextLine();

            if (!password.equals(currentPassword)) {
                i++;

                if (i == attempt) {
                    System.out.println("Your card is locked. Please contact nearest Bank");
                } else {
                    System.out.println("Wrong password, try again!");
                }
            } else {
                i += 3;
                showAtmMenu();
            }
        } while (i < attempt);
    }
}
