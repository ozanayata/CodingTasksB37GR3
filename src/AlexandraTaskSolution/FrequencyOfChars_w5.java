package AlexandraTaskSolution;

import java.util.HashMap;

public class FrequencyOfChars_w5 {

    public static void main(String[] args) {


        String input = "AAABBCDD";
        HashMap<Character, Integer> letterCount = new HashMap<>();

        // Check if the character is a letter
        for (char a : input.toCharArray())
            if (Character.isLetter(a)) {
                letterCount.put(a, letterCount.getOrDefault(a, 0) + 1);
            }
    // I use StringBuilder to create the output string in one line
        StringBuilder output = new StringBuilder();
        for (char letter : letterCount.keySet()) {
            output.append(letter).append(letterCount.get(letter));
        }

        // Remove the trailing comma and space, if needed
        if (output.length() > 0) {
            output.setLength(output.length() +1); // Remove the last ", "
        }

        // Print the results in one line
        System.out.println(output);
    }
}


        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter letter");
        //String str = input.next();
        //System.out.println("A");
       // String str = input.next();


        //input.close();

        //int total;
        //total = String str();

        //System.out.println("A" + charValue);
//String str = "AAABBCDD";
        //String firstLetter = str.substring(0,1);
        //int totalOfA;
        //totalOfA = "a".totalOfA(str);
        //System.out.println("A"+totalOfA);
//System.out.println(firstLetter.length);



// String firstWord = str.substring(0, str.indexOf(" "));
    /*
    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


*/
