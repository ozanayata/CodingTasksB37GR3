package AlvaroTask;

public class FindUniqueChars_W7 {
     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    //Cihat is volunteer

    public static void main(String[] args) {

        String duplicates = "AAABBBCCCDEF";

        System.out.println(unique(duplicates));


    }

    public static String unique(String str) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);


            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString();
    }

}
