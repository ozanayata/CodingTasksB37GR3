package AlexandraTaskSolution;

public class SwabTwoNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.println("Before swapping a is " + a + " and  b is " + b + ".");

        a = a + b; //5+7=12--> a become 12
        b = a - b; //12-7=5--> b become 5
        a = a - b; //12-5=7--> a become 7


        System.out.println("After swapping a is " + a + " and b is " + b + ".");


    }
}




