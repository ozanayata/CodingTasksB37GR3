package AlexandraTaskSolution;

// Numbers which are a multiple of 3, print "FIN".
// Numbers which are a multiple of 5, print "RA".
// Numbers which are a multiple of both 3 and 5, print "FINRA".
// !Commit and push right away, don't leave it for later.
//next MEETING time WED @3:30PM

public class FINRA_Task_Solution {

    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {


        for (int i = 1; i <= 30; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;
            if (by3 && by5) {
                System.out.print("FINRA ");
            } else if (by3) {
                System.out.print("FIN ");
            } else if (by5) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}

