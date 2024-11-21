package ivannaTaskSolution;

public class OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    public static void main(String[] args) {
        System.out.println("15 is an " + oddOrEven(15));
        System.out.println("1987 is an " + oddOrEven(1987));
        System.out.println("8 is an " + oddOrEven(8));

    }

    public static String oddOrEven(int num){
        if (num % 2 == 0){
            return "even";
        }else {
            return "odd";
        }
    }
}
