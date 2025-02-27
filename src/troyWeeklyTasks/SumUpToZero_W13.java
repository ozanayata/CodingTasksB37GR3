package troyWeeklyTasks;

import java.util.Arrays;

public class SumUpToZero_W13 {
    public static int[] UniqueSumToZero(int N) {
        // Step#1 --> Create an array to hold the result
        int[] result = new int[N];

        // Step#2 --> Need to use for loop. Fill the line with unique integers.
        for (int i = 0; i < N; i++) {

            // If N is even, fill the code line with pairs of positive and negative numbers
            if (i < N / 2) {
                result[i] = i + 1; // Fill with positive numbers
            } else {
                result[i] = -(i - (N / 2) + 1); // Fill with negative numbers
            }
        }

        // Step#3 --> Return the resulting array
        return result;
    }

    public static void main(String[] args) {
        int N = 4; // Example input
        int[] result =  UniqueSumToZero(N);
        System.out.println(Arrays.toString(result)); // Print the result
    }
}

     /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    // Alexandra is volunteer





