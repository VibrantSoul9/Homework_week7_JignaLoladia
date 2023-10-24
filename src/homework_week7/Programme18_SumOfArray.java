package homework_week7;

public class Programme18_SumOfArray {
    public static void main(String[] args){
        int[]
numbers = { 7, 14, 21, 28, 35, 42, 49};
    int sum = 0;
    for (int number : numbers) {
    sum += number;
    }
    System.out.println("Sum of the array elements: " + sum);
    }
}
