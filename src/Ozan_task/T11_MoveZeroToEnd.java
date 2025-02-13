package Ozan_task;

import java.util.Arrays;

public class T11_MoveZeroToEnd {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 5, 0, 6, 9};

        int[] moved = new int[nums.length]; // [0,0,0,0,0,0,0,0]

        for (int i = 0, y = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                moved[y++] = nums[i];   // Place non-zero value at index y, then increment y
//  moved[0,0,0,0,0,0,0,0] vs [1, 2, 0, 0, 5, 0, 6, 9]
//                     indexes=0, 1, 2, 3, 4, 5, 6, 7
            }


        }
        System.out.println(Arrays.toString(moved));

    }

}


     /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */

// Ozan is volunteer


