package ivannaTaskSolution;

public class ReverseString_W8 {


     /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    // Ivanna is volunteer


    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }






}
