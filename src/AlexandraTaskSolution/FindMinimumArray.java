package AlexandraTaskSolution;

public class FindMinimumArray {

    public static void main(String[] args) {
        int[] number={7,2,3,4,1,6,7,8,9};

        System.out.println(findMin(number));

    }

    public static int findMin(int[] number) {
        int min = number[0];
        for (int arr : number) {
            if (arr < min) {
                min = arr;

            }
        }

        return min;
    }


    /*
    Write a function that can find the minimum number from an int Array
     */



}
