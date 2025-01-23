package Ozan_task;

public class T8_Reverse_String {

    public static void main(String[] args) {
        String input = "ABCD";
        String output = reverseString(input);

        System.out.println(input);
    }
    public static String reverseString(String str) {
        String reversed = ""; // to store new string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // adding each char my string variable

        }
        return reversed;
    }

}
     /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

// Ivanna is volunteer
