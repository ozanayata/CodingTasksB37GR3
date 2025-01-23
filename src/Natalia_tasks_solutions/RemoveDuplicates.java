package Natalia_tasks_solutions;

public class RemoveDuplicates {
    /*
   Write function that can remove the duplicated values from String
           Ex: removeDup("AAABBBCCC") ==> ABC
    */



    public static String removeDup(String str) {
        String result = ""; // Initialize an empty string for the result

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Add the character only if it is not already in the result
            if (!result.contains("" + c) ) {

                result += c; // Add the character to the result
            }
        }

        return result;
    }



    public static void main(String[] args) {
        // Input string with duplicate characters
        String str = "AABBCCDDEFFFGGGGG";

        // Call the method to remove duplicates

        System.out.println(removeDup(str)); // Output: ABCDEFG
    }


}
