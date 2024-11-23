package Ozan_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinraTaskSolution {

        public static void main(String[] args) {

         //   ("--------------->solution1<-----------------");
//                for (int i = 1; i <=30; i++) {
//                    boolean divBy3 = i % 3 == 0;
//                    boolean divBy5 = i % 5 == 0;
//                    String result = "";
//                    if (divBy3 && divBy5) {
//                            System.out.print("FINRA");
//                    } else if (divBy3) {
//                            System.out.print("FIN");
//                    } else if (divBy5) {
//                            System.out.print("RA");
//                    } else {
//                            System.out.print(i);
//
//                    }
//
//                    System.out.print(result + " ");
//
//            }


            // ------------------> solution 2  <-------------------------- ///

                Scanner input = new Scanner(System.in);
                System.out.println("Enter starting number : ");
                int start = input.nextInt();
                System.out.println("Enter ending number : ");
                int end = input.nextInt();

                for(int i=start; i<=end; i++){
                        if(i%3==0 && i%5==0){
                                System.out.print("FINRA ");
                        }else if(i%3==0){
                                System.out.print("FIN ");
                        }else if(i%5==0){
                                System.out.print("RA ");
                        }else{
                                System.out.print(i+ " ");
                        }
                }


            }

        }