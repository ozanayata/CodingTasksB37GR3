package Natalia_tasks_solutions;
/*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */


public class FindUniqueChars_W7 {
    public static String findUniqueCharacters(String str) {
        String result = ""; // Initialize an empty string for the result

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character appears only once in the string
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result += c; // Add the character to the result
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Input string with duplicate and unique characters
        String str = "AAABBBCCCDEF";

        // Call the method to find unique characters
        System.out.println(findUniqueCharacters(str)); // Output: DEF
    }
}


