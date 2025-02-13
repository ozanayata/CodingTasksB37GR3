package troyWeeklyTasks;

import java.util.Arrays;

public class MoveZerosToEnd_W11 {


     /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */

    // Ozan is volunteer

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 0, 0, 5, 5, 4, 7, 9};

        int[] result = moveZerosToTheEnd(arr);
        System.out.println(Arrays.toString(result));

    }

}
