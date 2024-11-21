package Tara_tasks;



public class Number_FINRA_DivisibleBy3_5 {
    public static void main(String[] args) {

        for (int i = 1; i <=30; i++){//the for loop will iterate through nums 1-30
            //the i represents the even numbers in the sequence

            boolean Div3 = i % 3 ==0;//num div by 3 will return FIN
            boolean Div5 = i % 5 ==0;//num div by 5 will return RA

            if (Div3 && Div5){//If nums are div by 3 & 5 print FINRA
                System.out.println("FINRA");
            } else if (Div3) {//use else if when you want to check multiple conditions
                System.out.println("FIN");
            } else if (Div5) {
                System.out.println("RA");
            }else {
                System.out.println(i);//otherwise print out the even numbers
            }
        }


    }
}
