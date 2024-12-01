package Tara_tasks.OddOrEven;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int[] a = {13,3,2,6,17};
        int[] b = {26,27,44,72,16};

        System.out.println(sumOfOddNumbers(a));//this needs to be put last
        System.out.println(sumOfOddNumbers(b));//this needs to be put last
    }

    public static int sumOfOddNumbers (int [] numbers){
        int sum = 0;

        for (int number : numbers){
            if (number % 2 !=0){
                sum += number;
            }
        }
        return sum; //without this, it will not run
    }




}
