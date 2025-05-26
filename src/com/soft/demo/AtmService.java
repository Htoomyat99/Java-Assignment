package com.soft.demo;
import java.util.Scanner;

public class AtmService {
    //declare variable
    public static double initialBalance = 100_000.00;
    public static final int MAX_ATTEMPTS = 3;
    public static final String currentPassword = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptLeft = MAX_ATTEMPTS;

        while (attemptLeft > 0) {
            System.out.print("Enter your password : ");
            String password = scanner.nextLine();

            if (password.equals(currentPassword)) {
                showAtmMenu();
                break;
            } else {
                attemptLeft--;
                if (attemptLeft == 0) {
                    System.out.println("Your card is locked. Please contact nearest Bank");
                } else {
                    System.out.println("Wrong password, try again!");
                }
            }
        }
        scanner.close();
    }

    public static void showAtmMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean isLoop = true;
        while (isLoop) {
            System.out.println("==== My Bank Menu ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Exit \n");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            boolean isMatched = choice.matches("[1-3]");
            if (isMatched) {
                switch (choice) {
                    case "1":
                        System.out.printf("Your current balance is %.2f MMK \n", initialBalance);
                        break;
                    case "2":
                        withdrawCash();
                        break;
                    case "3":
                        isLoop = false;
                        System.out.println("Thank you for using our service.");
                        break;
                    default:
                        System.out.println("Invalid input! Please choose between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input! Please enter between 1 to 3");
            }
        }
    }

    public static void withdrawCash() {
        Scanner scanner = new Scanner(System.in);

        boolean isLoop = true;
        while (isLoop) {
            System.out.print("Please enter withdraw amount: ");
            String input = scanner.nextLine();
            boolean isMatched = input.matches("[1-9][0-9]*");

            if (isMatched) {
                int amount = Integer.parseInt(input);
                if (amount > initialBalance) {
                    System.out.println("You do not have enough balance to withdraw, please try again!");
                } else {
                    double result = initialBalance - amount;
                    initialBalance = result;
                    System.out.printf("Withdraw Succeed. Your remaining balance is %.2f MMK \n", result);
                }
                isLoop = false;
            } else {
                System.out.println("Please enter valid amount");
            }
        }
    }
}
