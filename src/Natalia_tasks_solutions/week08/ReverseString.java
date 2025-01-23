package Natalia_tasks_solutions.week08;
import java.util.Scanner;
/*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */


public class ReverseString {
    public static String reverseString(String str) {
        String result = ""; // Initialize an empty string for the reversed result

        // Iterate through each character in the string from the end to the start
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i); // Add each character to the result
        }

        return result; // Return the reversed string
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverseString(str));


    }

}

