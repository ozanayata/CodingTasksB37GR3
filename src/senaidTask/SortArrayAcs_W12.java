package senaidTask;

public class SortArrayAcs_W12 {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method


     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 2, 0, 5, 4, 7, 9};

        // Print the original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }

        System.out.println(); // Move to the next line

        int temp;
        // Sort the array using a basic loop
        for (int i = 0; i < arr.length; i++) {    //1, 2, 0, 5, 4, 7, 9
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) { // If the current element is greater, swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }
        System.out.println(); // Move to the next line
    }


}
