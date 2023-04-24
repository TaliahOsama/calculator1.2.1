package org.example;

import org.example.Calculator;

import java.util.Scanner;

public class CalculatorTerminal {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the first number: ");
                    int a = scanner.nextInt();
                    System.out.println("Enter the second number: ");
                    int b = scanner.nextInt();
                    System.out.println("Result: " + calculator.add(a, b));
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number: ");
                    b = scanner.nextInt();
                    System.out.println("Result: " + calculator.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number: ");
                    b = scanner.nextInt();
                    System.out.println("Result: " + calculator.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number: ");
                    b = scanner.nextInt();
                    double result = calculator.divide(a, b);
                    if (result == Double.POSITIVE_INFINITY) {
                        System.out.println("Result: " + result);
                    }
                    break;
                case 0:
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;

            }
        }
    }
}


