package Ozan_task;

public class T7_UniqueCharSolution {

    public static void main(String[] args) {
        String theInput = "AAABBBCCCDEF";

        String theOutput = chooseUniqueChars(theInput);
        System.out.println(theOutput);

    }

    public static String chooseUniqueChars(String str) {
        StringBuilder uniqChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char character= str.charAt(i);

            if(str.indexOf(character)==str.lastIndexOf(character)){
                uniqChars.append(character);
            }


        }
        return uniqChars.toString();

    }
}





/*
     --TASK<__
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */