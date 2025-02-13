package AlvaroTask;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate_W6 {

      /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    //Natalia is volunteer


    public static void main(String[] args) {
        String letters = "AAABBBCCC";
        removeDuplicates(letters);

    }

    public static void removeDuplicates(String duplicates) {

        HashSet<String> set = new HashSet<>(Arrays.asList(duplicates.split("")));
        for (String each : set) {
            System.out.print(each);
        }

    }

}
