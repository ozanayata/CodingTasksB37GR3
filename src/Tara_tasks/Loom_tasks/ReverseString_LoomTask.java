package Tara_tasks.Loom_tasks;

public class ReverseString_LoomTask {
    public static void main(String[] args) {
        //Solution 1
        //the for loop will start w/ the last character and decrease until it gets to the first char
        String sb = "Cool Coding";//start from g and work it's way back to the last c
        String reversed = "";
        //choose Stringbuilder reverse() because it reverse the chars of the string

        //                                  important to decrement instead of positive sign
        for (int i = sb.length() -1; i >=0; i--){
            reversed += sb.charAt(i);
        }
        System.out.println(reversed);

        System.out.println("=================================");
        //Solution 2
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cool");
        sb2.append("  ");
        sb2.append("Coding");
        System.out.println(sb2);
        System.out.println("============================");
        sb2.reverse();
        System.out.println(sb2);



    }
}
