package Ozan_task;

public class oddoreven {/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

    */
        public static void main(String[] args) {
            System.out.println("6 is an " + oddOrEven(6));
            System.out.println("5 is an " + oddOrEven(5));


        }
        public static String oddOrEven(int num) {
            if (num % 2 == 0) {
                return "even";
            }else{
                return "odd";
            }
        }

    }


