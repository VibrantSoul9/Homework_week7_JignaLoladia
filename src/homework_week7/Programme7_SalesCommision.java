package homework_week7;

import java.util.Scanner;

public class Programme7_SalesCommision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salesID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume the nextline character
        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Salary Basic: ");
        double salaryBasic = scanner.nextDouble();
        // Calculate sales commission based on sales amout
        double commission = 0.0;
        if (salesAmount >= 50000) {
            commission = 0.35 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.20 * salesAmount;
        } else if (salesAmount >= 20000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 10000) {
            commission = 0.05 * salesAmount;
        } else {
            commission = 0.02 * salesAmount;
        }
    // Print the sales commission
        System.out.println("_______________________________");
        System.out.println("| Sales Commission Calculator  |");
        System.out.println("|______________________________|");
        System.out.println("| Sales ID : " + salesId + "            |");
        System.out.println("| Seller's Name : " + sellerName + "       |");
        System.out.println("| Sales Amount : " + salesAmount + "      |");
        System.out.println("| Salary Basic : " + salaryBasic + "      |");
        System.out.println("|_______________________________|");
        System.out.println("| Sales Commission : " + commission + "   |");
        System.out.println("|===============================|");
    }

}
