package Natalia_tasks_solutions.week05;
//Write function that can find the frequency of characters

//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static String getFrequency(String str) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        // Count frequencies
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // Build result string
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String frequency = getFrequency(input);
        System.out.println("Frequency of characters: " + frequency);
    }
}
