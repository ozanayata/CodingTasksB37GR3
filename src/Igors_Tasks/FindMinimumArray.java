package Igors_Tasks;

public class FindMinimumArray {

    public static void main(String[] args) {


        int[] numbers = {4, 2, 1, 8, 17};
        int min = numbers[0];

        for (int each : numbers) {
            if (each < min) {
                min = each;
            }
        }

        System.out.println("Minimum number is: " + min);
    }

}
