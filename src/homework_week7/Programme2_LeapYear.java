package homework_week7;

import java.util.Scanner;

public class Programme2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year. You have 366 days Enjoy Extra Day :-).");
        } else {
            System.out.println(year + " is not a leap year. You have 365 days make most of it.");
        }
        scanner.close();
        }

    }
