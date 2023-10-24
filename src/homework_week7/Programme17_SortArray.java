package homework_week7;

import java.util.Arrays;
public class Programme17_SortArray {
        public static void main(String[] args) {
            // Numeric Array Sorting
            int[] numbericArray = {8, 4, 9, 3, 6, 5};
            Arrays.sort(numbericArray);
            System.out.println("Sorted Numberic Array: " + Arrays.toString(numbericArray));

            // String Array Sorting
            String[] stringArray = {" cashew", "almond", "wallnut", "dates", "apricot"};
            Arrays.sort(stringArray);
            System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
        }
    }

