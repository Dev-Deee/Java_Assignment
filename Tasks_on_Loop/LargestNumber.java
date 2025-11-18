import java.util.Scanner;
public class LargestNumber{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);

    int sentinel = -1;
    
    System.out.print("Enter number or -1 to quit: ");
    int userInput = input.nextInt();

    if (userInput == sentinel){
    System.out.print("No value was entered");
    }
    
    int largestNumber = userInput;
    int smallestNumber = userInput;

    while (userInput != sentinel){
       System.out.print("Enter number or -1 to quit: ");  
         userInput++; 

    if(userInput > largestNumber){
        largestNumber = userInput;
        }

     if(userInput < largestNumber){
        smallestNumber= userInput;
        }    
           
    }
         
        System.out.print("largest number is "+ largestNumber);
        System.out.print("largest number is "+ smallestNumber);

    }
}
