import java.util.Scanner;
public class LargestNumber{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
//   int userInput;
   int sentinel = -1;
  
   
//  if (userInput == sentinel){
//
//    System.out.println("Enter number or -1 to quit: ");
//    userInput = input.nextInt();
//
//    System.out.println("No value was entered");
//    }
    System.out.println("Enter number or -1 to quit: ");
    int userInput = input.nextInt();
    
    int largestNumber = userInput;
    int smallestNumber = userInput;

    while (userInput != sentinel){
    
    if(userInput == -1){
        break;
    }


    if(userInput > largestNumber){
        largestNumber = userInput;
        }

     if(userInput < smallestNumber){
        smallestNumber = userInput;
       }    

    System.out.println("Enter number or -1 to quit: ");
    userInput = input.nextInt();
    }
         
      System.out.println("largest number is "+ largestNumber);
      System.out.println("smallest number is "+ smallestNumber);


   
    
 }
}
