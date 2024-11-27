package Natalia_tasks_solutions.week01;

public class OddOrEven {
    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    public static String identify(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println("identify(" + num1 + ") -> \"" + identify(num1) + "\"");
        System.out.println("identify(" + num2 + ") -> \"" + identify(num2) + "\"");
    }





}
