package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = scan.nextInt();
        System.out.println("Enter your second number");
        int secondNum = scan.nextInt();

        Calculator calc = new Calculator();
        int result =  calc.add(firstNum, secondNum);
        System.out.println("The result is: " + result);

    }
}
