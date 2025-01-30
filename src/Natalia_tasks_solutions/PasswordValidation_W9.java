package Natalia_tasks_solutions;
 /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */


import java.util.Scanner;

public class PasswordValidation_W9 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) return false;

        boolean upper = false, lower = false, digit = false, special = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) upper = true;
            else if (Character.isLowerCase(ch)) lower = true;
            else if (Character.isDigit(ch)) digit = true;
            else if (!Character.isLetterOrDigit(ch)) special = true;

            if (upper && lower && digit && special) return true; // Exit early if all conditions met
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter your password: ");
        String password = scanner.nextLine(); // Read user input

        if (isValidPassword(password)) {
            System.out.println("Password is valid ✅");
        } else {
            System.out.println("Password is invalid ❌");
        }

        scanner.close(); // Close the scanner
    }

}
