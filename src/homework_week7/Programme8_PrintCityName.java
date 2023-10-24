package homework_week7;

import java.util.Scanner;

public class Programme8_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphbet (A to F): ");
        char alphabet = scanner.next().charAt(0);
        String city;
        if (alphabet == 'A') {
            city = "New York";
        } else if (alphabet == 'B') {
            city = "Los Angles";
        } else if (alphabet == 'C') {
            city = "Chicago";
        } else if (alphabet == 'D') {
            city = "Dallas";
        } else if (alphabet == 'E') {
            city = "San Francisco";
        } else if (alphabet == 'F') {
            city = "Miami";
        } else {
         city = "Invalid Entry";
    }
    System.out.println("City Name: " + city);
        scanner.close();
        }
    }

