package homework_week7;

import java.util.Scanner;

public class Programme10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter a mathematical symbol (+, -, /, *)");
        char symbol = scanner.next().charAt(0);
        double result = 0.0;
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            result = num1 / num2;
            System.out.println("Result: " + result);
        }
        }
}
