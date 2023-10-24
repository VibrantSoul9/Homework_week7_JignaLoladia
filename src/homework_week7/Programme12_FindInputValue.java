package homework_week7;

import java.util.Scanner;

public class Programme12_FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (Character.isDigit(input)) {
            System.out.println("Input is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("In put is a Symbol.");
        }
    }
}
