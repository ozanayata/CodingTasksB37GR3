package AlexandraTaskSolution;

import java.util.Scanner;

public class OddOrEven {

    public static void identify() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number to see if it's odd or even: ");
        int number = reader.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }


    }
    public static void main(String[] args) {

        identify();

    }

}
