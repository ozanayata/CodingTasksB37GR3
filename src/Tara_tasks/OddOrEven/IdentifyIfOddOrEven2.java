package Tara_tasks.OddOrEven;

public class IdentifyIfOddOrEven2 {
//Solution 2
     public static String identifyIfOddOrEven2(int number){//identifyIfOdd is the method name.
         if (number % 2 == 0){
             return "False"; // Even Number
         }else {
             return "True"; // Odd number
         }
     }

    public static void main(String[] args) {
        System.out.println(identifyIfOddOrEven2(13));
        System.out.println(identifyIfOddOrEven2(333));
        System.out.println(identifyIfOddOrEven2(24));
        System.out.println(identifyIfOddOrEven2(62));
        System.out.println(identifyIfOddOrEven2(44));
    }
}




