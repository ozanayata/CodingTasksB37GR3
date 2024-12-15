package ivannaTaskSolution;

public class FrequencyOfChars_W5 {

/*
    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


    Alexandra is volunteer
*/
public static String frequencyOfChars(String s) {
    String result = "";

    // Loop through the string
    while (s.length() > 0) {
        char currentChar = s.charAt(0);  // Get the first character
        int count = 0;

        // Count occurrences of the current character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            }
        }

        // Append character and its count to the result
        result += currentChar + String.valueOf(count);

        // Remove all occurrences of the current character from the string
        s = s.replace(String.valueOf(currentChar), "");
    }

    return result;
}

    public static void main(String[] args) {
        // Example usage
        System.out.println(frequencyOfChars("AAABBCDD"));  // Output: A3B2C1D2
    }


}
