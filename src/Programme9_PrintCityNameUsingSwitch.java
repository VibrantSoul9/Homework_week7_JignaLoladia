import java.util.Scanner;

public class Programme9_PrintCityNameUsingSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        char input = scanner.next().charAt(0);
        switch (input) {
            case 'A':
                System.out.println("City: Amsterdam");
                break;
            case 'B':
                System.out.println("City: Berlin");
                break;
            case 'C':
                System.out.println("City: Cairo");
                break;
            case 'D':
                System.out.println("City: Delhi");
                break;
            case 'E':
                System.out.println("City: Edinburgh");
                break;
            case 'F':
                System.out.println("City: Florence");
                break;
            default:
                System.out.println("Invalid entry.");
        }
    }
}
