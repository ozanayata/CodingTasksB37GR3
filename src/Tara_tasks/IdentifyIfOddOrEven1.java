package Tara_tasks;


public class IdentifyIfOddOrEven1 {

    //First Solution
    public static String identify(int number){
        if (number % 2 ==0){
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(17));
        System.out.println(identify(12));
        System.out.println(identify(26));
        System.out.println(identify(33));
    }






}
//Hello World
/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */