package Natalia_tasks_solutions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // Swapping without a third variable
        a = a + b; // a becomes 12 (5 + 7)
        b = a - b; // b becomes 5 (12 - 7)
        a = a - b; // a becomes 7 (12 - 5)

        System.out.println("a = " + a); // a = 7
        System.out.println("b = " + b); // b = 5
    }
}
