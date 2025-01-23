package AlvaroTask;

public class ReverseString_W8 {

       /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    // Ivanna is volunteer

    public static void main(String[] args) {

        String letters = "ABCD";

        StringBuilder reversed = new StringBuilder(letters);
        reversed.reverse();
        System.out.println(reversed);

    }

}
