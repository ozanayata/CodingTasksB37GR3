package Ozan_task;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesTaskSol {


    public static void main(String[] args) {
        String letters = "AAAABBBBCCCC";
        removeDuplicates(letters);

    }

    public static void removeDuplicates(String duplicate) {

        HashSet<String> set = new HashSet<>(Arrays.asList(duplicate.split("")));
        for (String s : set) {
            System.out.print(s);
        }

    }


}