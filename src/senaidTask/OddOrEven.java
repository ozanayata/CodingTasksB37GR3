package senaidTask;

public class OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;

        evenOdd(num1);
        evenOdd(num2);

    }

    public static void evenOdd(int num){

        if (num % 2 == 0){
            System.out.println(num + " is Even number");
        }else {
            System.out.println(num + " is Odd number");
        }
    }
}
