package Natalia_tasks_solutions;

import java.util.Arrays;

public class FindMinimumArray_W10 {
    public class MinFinder {
        public static int findMin(int[] arr) {
            return Arrays.stream(arr).min().getAsInt();
        }

        public static void main(String[] args) {
            int[] numbers = {5, 2, 9, 1, 6, -3, 7};
            System.out.println("Minimum number: " + findMin(numbers)); // Output: -3
        }
     /*
    Write a function that can find the minimum number from an int Array
     */
    }
}
