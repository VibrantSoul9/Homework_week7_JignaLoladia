package homework_week7;

public class Programme20_FindValueInArray {
    public static void main(String[] args){
        int[] numbers = { 9, 22, 45, 32, 78, 66};
        int targetValue = 22;
        boolean found = false;
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // if value is found exit the loop
            }
        }
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
