package Igors_Tasks;

public class OddOrEven {
    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static String oddOrEven(int num){
        if (num % 2 == 0){
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {

        System.out.println("number 4 is: " + oddOrEven( 4));
        System.out.println("number 5 is: " + oddOrEven( 5));

    }


}
