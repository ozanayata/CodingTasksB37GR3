package senaidTask;

/*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    EX:
    1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
     */


public class Number_FINRA_DivisibleBy3_5 {

    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                result += " FINRA ";
            } else if (i % 3 == 0) {
                result += " FIN ";
            } else if (i % 5 == 0) {
                result += " RA ";
            }else {
                result += i + " ";
            }


        }
        System.out.print(result);


    }


}
