import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    boolean isTrue = true;
    int number = 1;
    
    System.out.print("Enter a number: ");
     int userInput = input.nextInt();


    int result = 1;
    int factorial = 1;
    for(number = 1; number <= userInput; number++){
        result = number;
        factorial *= result;
            }
        
        System.out.println(factorial);
 
}
}
