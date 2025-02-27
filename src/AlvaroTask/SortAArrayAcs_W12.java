package AlvaroTask;

public class SortAArrayAcs_W12 {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method


     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] input = {1, 2, 0, 5, 4, 7, 9};

        // Sorting the array
        selectionSort(input);

        // Output the sorted array
        System.out.print("Sorted array: ");
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

}
