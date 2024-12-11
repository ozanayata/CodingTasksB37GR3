package Natalia_tasks_solutions.week04;
/*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654




     */



public class Number_ReverseNegative_W4 {
    public static void main(String[] args) {
        int input = -456;
        int output = reverseNegative(input);
        System.out.println(output); // Output: -654
    }

    public static int reverseNegative(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number");
        } //Check if the input is negative: If the number is not negative, throw an IllegalArgumentException.

        // Remove the negative sign, reverse the digits, and add the negative sign back
        int reversedNum = Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(num))).reverse().toString());
        return -reversedNum;
        /*
        Convert the number to a positive string: Use Math.abs(num) to get the absolute value of the number, and then convert it to a string.
Reverse the string: Use StringBuilder to reverse the string representation of the number.
Convert back to integer: Use Integer.parseInt() to parse the reversed string as an integer.
Add the negative sign back: Multiply the reversed number by -1 to make it negative again.
Return the result.
         */
    }
}






