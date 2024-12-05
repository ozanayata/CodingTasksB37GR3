package Tara_tasks.OddOrEven;

import java.util.function.Predicate;//make sure this is imported or it will not work

public class OddOrEven3 {
    public static void main(String[] args) {
    //Solution3
        Predicate<Integer> isOdd = (a) -> {//declare the predicate first and must use lambda to take the input and return boolean

            if (a % 2 !=0){ //if it's odd / %2==0 for even
                return true; //return true if it's odd
            }else {//or else return false if its even
                return false;
            }
        };

        System.out.println("============================");

        Predicate<Integer> isEven = (b) -> {
            if (b % 2 ==0){
                return true;
            }else {
                return false;
            }
        };

        boolean num5 = isEven.test(16);
        boolean num6 = isEven.test(18);
        boolean num7 = isEven.test(20);
        boolean num8 = isEven.test(22);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println("=========================================");

        boolean num1 = isOdd.test(13);//pick random numbers to try out the method. But declare the numbers first
        boolean num2 = isOdd.test(12);//you can title it anything o1, r1, num1, anything
        boolean num3 = isOdd.test(66);
        boolean num4 = isOdd.test(44);
        System.out.println(num1);//this will print the result of each predicate test
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
//Predicate - represents one function which takes one argument and returns boolean
