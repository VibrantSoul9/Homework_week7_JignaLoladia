package homework_week7;

public class Programme19_AverageOfArray {
    public static void main(String[] args) {
        double[] numbers = { 12.4, 24.6, 32.8, 12.2,9.5,8.5};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Average of the array elements:" + average);
   }
}
