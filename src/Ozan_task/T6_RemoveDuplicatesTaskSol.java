package Ozan_task;

import java.util.Arrays;
import java.util.HashSet;

public class T6_RemoveDuplicatesTaskSol {


    public static void main(String[] args) {
        String letters = "AAAABBBBCCCC";
        removeDuplicates(letters);

    }

    public static void removeDuplicates(String duplicated) {

        HashSet<String> set = new HashSet<>(Arrays.asList(duplicated.split("")));
        for (String s : set) {
            System.out.print(s);
        }

    }


}