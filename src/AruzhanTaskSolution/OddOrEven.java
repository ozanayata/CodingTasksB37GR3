package AruzhanTaskSolution;

public class OddOrEven {


    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */


    public static String identifyGivenNumber(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String a = identifyGivenNumber(8);
        System.out.println(a);

        String b = identifyGivenNumber(11);
        System.out.println(b);
    }


}
