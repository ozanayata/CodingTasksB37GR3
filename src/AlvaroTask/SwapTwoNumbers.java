package AlvaroTask;

public class SwapTwoNumbers {

    /*
  Swap two variable values without using a third variable

  int a = 5;
  int b = 7;

 System.out.println("a = " + a); //=> a = 7
 System.out.println("b = " + b); //=> b = 5
   */
    public static void main(String[] args) {


        int a = 5;
        int b = 7;

        a = b + a; //a = 7 + 5
        b = a - b; //b = 12 - 7 -> 5
        a = a - b; //a = 12 - 5 -> 7

        System.out.println(a);
        System.out.println(b);


        //Second Approach
//        b = a + b; // b =  5 + 7 -> 12
//        a = b - a; // a = 12 - 5 -> 7
//        b = b - a; // b = 12 - 7 -> 5
//        System.out.println(a);
//        System.out.println(b);

    }

}
