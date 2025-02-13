package AlvaroTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MoveZerosToEnd_W11 {

    /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */

    public static void main(String[] args) {

        int[] input = {1, 2, 0, 0, 5, 0, 6, 9};
        moveZerosToEnd(input);

        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int j = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        while (j < arr.length) {
            arr[j++] = 0;
        }
    }



    }

