package AruzhanTaskSolution;

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

      //1
        int[] array = {a, b};
        array[0] = array[0] + array[1]; // 12
        array[1] = array[0] - array[1]; // 5
        array[0] = array[0] - array[1]; // 7

        a = array[0];
        b = array[1];

        System.out.println("a = " + a); // 7
        System.out.println("b = " + b); // 5

    }
}
