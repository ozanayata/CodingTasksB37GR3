package Ozan_task;

public class T5_FrequencyOfChars {

        public static void main(String[] args) {

            String input = "AABBBCCCCDDDDD";
            String output = frequencyOf(input);
            System.out.println(output);

        }

        public static String frequencyOf(String latter) {
            String result = "";
            while (!latter.isEmpty()) {
                char chr = latter.charAt(0);
                int count = 0;
                for (int i = 0; i < latter.length(); i++) {
                    if (latter.charAt(i) == chr) {
                        count++;
                    }
                }
                result += chr + "" + count;// i can just concatenate or use String.valueOf to get the count as string
                latter = latter.replace(Character.toString(chr), "");
            }
            return result;
        }

    }

//String restult= "AAABBCCDDD"
//
//    Write function that can find the frequency of characters
//
//
//    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


