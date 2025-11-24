import java.util.Scanner;
public class LargestNumber{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
   int userInput = 0;
   int sentinel = -1;
    boolean isRunning = true;
    
   
  if (userInput != sentinel){

    System.out.print("Enter number or -1 to quit: ");
    userInput = input.nextInt();

    System.out.print("No value was entered");
    }
    
    int largestNumber = userInput;
    int smallestNumber = userInput;

    while (isRunning){
       System.out.print("Enter number or -1 to quit: ");  
         

    if(userInput > largestNumber){
        largestNumber = userInput;
        }

     if(userInput < largestNumber){
        smallestNumber= userInput;
       }    
          userInput +=  1; 
    }
         
      System.out.print("largest number is "+ largestNumber);
      System.out.print("largest number is "+ smallestNumber);


   
    
 }
}
