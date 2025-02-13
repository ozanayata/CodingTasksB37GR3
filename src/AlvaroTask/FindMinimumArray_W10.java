package AlvaroTask;

public class FindMinimumArray_W10 {

     /*
    Write a function that can find the minimum number from an int Array
     */

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60,70,80,90};

        System.out.println("findMinimum(numbers) = " + findMinimum(numbers));

    }

    public static int findMinimum(int[] array) {
        int min = array[0];

        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }


}
