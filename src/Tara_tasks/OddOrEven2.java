package Tara_tasks;

public class OddOrEven2 {
//Solution 2
    public static String identify(int number){
        if (number % 2 ==0){
            return "True";

        }else {
            return "False";
        }
    }

    public static void main(String[] args) {
        System.out.println(identify(13));
        System.out.println(identify(333));
        System.out.println(identify(24));
        System.out.println(identify(62));
        System.out.println(identify(44));
    }
}
