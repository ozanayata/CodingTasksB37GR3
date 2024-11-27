package Natalia_tasks_solutions.week02;
/*Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
and for numbers which are a multiple of 5, print "RA" instead of the number.
        for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

EX:
        1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
     */

public class FINRA {
    // Method to print numbers from 1 to 30 with FINRA logic
    public static void printNumbers() {
        for (int i = 1; i <= 30; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;

            if (by3 && by5) {
                System.out.print("FINRA ");
            } else if (by3) {
                System.out.print("FIN ");
            } else if (by5) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        printNumbers();
    }
}

