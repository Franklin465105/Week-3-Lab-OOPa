package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int firstNum = input.nextInt(); // Prompts user for the first number
        System.out.println("Enter your second number: ");
        int secondNum = input.nextInt(); // Prompts user for the second number

        input.nextLine();

        System.out.println("Choose an operation (add, subtract, multiply, divide, power, modulo): ");
        String operation = input.next(); // Waits for correct input


        double result = switch (operation) {
            case "add" -> {
                Calculator calc = new Calculator();
                yield calc.add(firstNum, secondNum);
            }
            case "subtract" -> {
                Calculator calc = new Calculator();
                yield calc.sub(firstNum, secondNum);
            }
            case "multiply" -> {
                Calculator calc = new Calculator();
                yield calc.multiply(firstNum, secondNum);
            }
            case "divide" -> {
                Calculator calc = new Calculator();
                yield calc.divide(firstNum, secondNum);
            }
            case "power" -> {
                Calculator calc = new Calculator();
                yield calc.power(firstNum, secondNum);
            }
            case "modulo" -> {
                Calculator calc = new Calculator();
                yield calc.modulo(firstNum, secondNum);
            }
            default -> {
                System.out.println("Invalid operation.");
                yield 0;
            }

        };
        System.out.println("The result is: " + result);

    }
}
