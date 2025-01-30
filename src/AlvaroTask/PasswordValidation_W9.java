package AlvaroTask;

public class PasswordValidation_W9 {

    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */

    //Alvaro is volunteer

    public static boolean customPassword(String password) {

        // Password MUST be at least have 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // PassWord should at least contain one upper case letter
        if (!password.matches(".*[A-Z].*")) { //This is a regular expression
            return false;
        }

        // PassWord should at least contain one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Password should at least contain one special characters
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            return false;
        }

        // Password should at least contain a digit
        if (!password.matches(".*\\d.*")) { //This is a regular expression (regex) pattern
            return false;
        }

        // If all checks pass
        return true;
    }

    public static void main(String[] args) {
        String password = "Cydeo.2025";
        System.out.println(customPassword(password));
        if (customPassword(password)) {
            System.out.println("Your password is correct");
        }
    }

}
