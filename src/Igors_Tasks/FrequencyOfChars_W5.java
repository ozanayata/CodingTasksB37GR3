package Igors_Tasks;

public class FrequencyOfChars_W5 {

    public static String charFrequency (String str){

        int [] charCount = new int[256];

        for (char c : str.toCharArray()){
            charCount[c]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 256; i++){
            if (charCount[i] > 0){
                result.append((char) i). append(charCount[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println("charFrequency(str) = " + charFrequency(str));
    }

}
