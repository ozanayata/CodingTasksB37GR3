package AlvaroTask;

public class FrequencyOfChars_W5 {

    /*
    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

*/

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));
    }
    public static String frequencyOfChars(String s) {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (result.toString().contains(String.valueOf(currentChar))) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }

            result.append(currentChar).append(count);
        }

        return result.toString();
    }

}
