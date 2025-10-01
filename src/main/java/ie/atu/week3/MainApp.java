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

        System.out.println("Choose an operation (add, subtract, multiply, divide): ");
        String operation = input.next(); // Waits for correct input

        if (input.hasNextDouble()) {

        }


        double result = switch (operation) {
            case "add" -> {
                Calculator calc = new Calculator();
                yield calc.add(firstNum, secondNum);
            }
            case "subtract" -> {
                Calculator calc = new Calculator();
                yield calc.sub(firstNum, secondNum);
            }
            default -> {
                System.out.println("Invalid operation.");
                yield 0;

            }

        };
        System.out.println("The result is: " + result);

    }
}
