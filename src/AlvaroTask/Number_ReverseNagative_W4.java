package AlvaroTask;

public class Number_ReverseNagative_W4 {
    /*
   Write a return method that can reverse
negative number and return it as int

     Ex:
     input => -456
     output => -654

    */
    public static void main(String[] args) {
        int inputNumber = -456;
        int outputNumber = reverseNegativeNumber(inputNumber);
        System.out.println(outputNumber); // Output: -654

    }

    public static int reverseNegativeNumber(int n) {
        if (n >= 0) {
            throw new IllegalArgumentException("Input must be a negative number");
        }
        String numberStr = Integer.toString(n);
        String reversedStr = new StringBuilder(numberStr.substring(1)).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedStr);
        return -reversedNumber;
    }
}


