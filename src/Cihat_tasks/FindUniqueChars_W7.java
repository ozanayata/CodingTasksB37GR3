package Cihat_tasks;

public class FindUniqueChars_W7 {

       /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters: " + unique(input)); // Output: "DEF"
    }

    public static String unique(String str) {

        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) { //indexOf finds the first occurrence of the character.
                uniqueChars.append(currentChar);                            //lastIndexOf finds the last occurrence of the character.
            }
        }

        return uniqueChars.toString();  //The method returns the StringBuilder as a string.
    }
}
