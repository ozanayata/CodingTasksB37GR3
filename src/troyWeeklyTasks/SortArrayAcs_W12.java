package troyWeeklyTasks;

import java.util.Arrays;

public class SortArrayAcs_W12 {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method


     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    // Senaid is volunteer


    public static int[] sortingArrayAsc(int[] arr) {



        System.out.println(Arrays.toString(arr)); // before sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;


    }

}
