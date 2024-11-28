package AlexandraTaskSolution;

/*
()--> parenthesis, (")--> quotation mark, (\)--> back slash, (^)-->caret, (~)-->tilde, (:)-->colon
--------------------------------------------------------------------------------------------------
LOOM ASSIGNMENT.Verbal explanation:
   Create a class named ReverseString
--------------------------------------------------------------------------------------------------
   1. I'm going to apply for loop logic. This method provides reversed result of original string in the end.

   2. First, I need to print my main method.
      -> public static void main(String[] args){

   3. Next step is to initialize my given string which is "Java is cool".
      -> String str = "Java is cool";

   4. In the third line I have to declare my another variable. The reversed version of the string.
      -> String reversedStr = " ";

   5. In order to store characters of my original string from last to the first I need
     to apply for loop formula. The formula will be  a total numbers of the characters of the string -1.
       -> for (int i = str.length() - 1; i >= 0; i-- ) {
     ...where  int i = str.length() represent total numbers of characters and I subtract 1 because
     it will give me the last index of the string
     ...I also need to specify condition , so as long as i>= 0   I can let the loop continue to be repeated.
     Now I have 1-- left to print out - in order  to reach the first index number starting from last
     to the first. I have to make sure that the index number is decreasing by one during each iteration.

   6. In my next line of code I'm going to store result of my previous line code.
      -> reversedStr += str.charAt(i);

   7. Finally, my last step is to print a reversed print statement of my string which is "Java is cool".
       -> System.out.println(reversedStr);



 */

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java is cool";
        String reversedStr = "";


        for (int i = str.length() - 1; i >= 0; i-- ) {
             reversedStr += str.charAt(i);

            }

        System.out.println(reversedStr);
        }
    }



