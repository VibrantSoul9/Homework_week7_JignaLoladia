package homework_week7;

import java.util.Scanner;

public class Programme5_SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Employee Name: ");

        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, TA, DA, PF and Gross Salary
        double hra = 0.10 * basicSalary;
        double ta = 0.08 * basicSalary;
        double da = 0.09 * basicSalary;
        double pf = 0.20 * basicSalary;
        double grossSalary = basicSalary + hra + ta + da - pf;

        // print the salary slip
        System.out.println("___________________________");
        System.out.println("| Salary Slip               |");
        System.out.println("|___________________________|");
        System.out.println("| Employee Id : " + employeeID + "     |");
        System.out.println("| Employee Name : " + employeeName + "  |");
        System.out.println("|____________________________________|");
        System.out.println("| Basic Salary : " + basicSalary + "    |");
        System.out.println("| HRA 10% : " + hra + "                |");
        System.out.println("| TA 8% : " + ta + "                 |");
        System.out.println("| DA 9% : " + da + "                 |");
        System.out.println("| PF - 20% : " + pf + "              |");
        System.out.println("|_____________________________________|");
        System.out.println("| Gross Salary : " + grossSalary + "   |");
        System.out.println("|======================================|");
        scanner.close();
        }
    }
