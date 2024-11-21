package Tara_tasks;

public class OddOrEven2 {
//Solution 2
     public static String identifyIfOdd(int number){
         if (number % 2 == 0){
             return "False"; // Even Number
         }else {
             return "True"; // Odd number
         }
     }

    public static void main(String[] args) {
        System.out.println(identifyIfOdd(13));
        System.out.println(identifyIfOdd(333));
        System.out.println(identifyIfOdd(24));
        System.out.println(identifyIfOdd(62));
        System.out.println(identifyIfOdd(44));
    }
}
