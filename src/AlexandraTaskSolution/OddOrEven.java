import java.util.Scanner;

public static void identify5() {

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the number to see if it's odd or even: ");
    int number = reader.nextInt();


    if (num % 2 == 0) {
        System.out.println(num + " is even");
    } else {
        System.out.println(num + " is odd");

    }

}


