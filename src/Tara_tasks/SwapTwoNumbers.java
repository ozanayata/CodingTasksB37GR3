package Tara_tasks;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        a = a + b;// 5 + 7 = 12--> a is now 12
        b = a - b; // 12 - 7 = 5 --> b is now 5
        a = a - b; // 12 -5 =7 --> a is now 7

        System.out.println("a = " + a); //=> a = 7
        System.out.println("b = " + b); //=> b = 5
    }
}
