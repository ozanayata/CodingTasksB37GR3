package Ozan_task;

public class reverseNegativeNum {
    public static void main(String[] args) {


        int input= -456;
        int output= reverseNegative(input); // stored my new value into that variable
        System.out.println("reversed number= " + output);


    }
    public static int reverseNegative(int num) {// i made it static it is unique for my class...can be called with class name
        if (num > 0) {
            throw new RuntimeException("Number can not be positive"); // not letting us  pass down positive number// if i remove it, my code will also reverse the positive numbers.
        }
       num = Math.abs(num); // return every number to a positive value...
       int reversed = 0;
        while (num > 0) { //
            int digit = num % 10;
           reversed = reversed * 10 + digit;
           num = num/ 10;

       }
       return -reversed;
    }

}
