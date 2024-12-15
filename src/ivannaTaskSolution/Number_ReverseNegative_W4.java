package ivannaTaskSolution;

public class Number_ReverseNegative_W4 {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654

      Aruzha is volunteer
     */
    public static int reverseNegativeNumber(int num) {
        // Check if the number is negative
        boolean isNegative = num < 0;

        // Make the number positive for reversal if it's negative
        if (isNegative) {
            num = -num;
        }

        // Reverse the digits of the number
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            num = num / 10; // Remove the last digit
        }

        // If the number was originally negative, return the reversed number with the negative sign
        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(reverseNegativeNumber(-456));  // Output: -654
        System.out.println(reverseNegativeNumber(123));   // Output: 321
        System.out.println(reverseNegativeNumber(-789));  // Output: -987
    }






}
