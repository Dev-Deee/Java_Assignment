import java.util.Random;
import java.util.Scanner;
public class WhileLoopRandom{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int count = 0;
    int randomNumber = random.nextInt(0,101);

    System.out.print("Enter a number between 1-100 to guess the correct number: ");
    int guess = input.nextInt();

    while(guess != randomNumber){
    System.out.print("guess again ");
    guess = input.nextInt();
     

    if(guess > randomNumber){
    System.out.print("Too high, Try again! "); 
    }
    else {
    System.out.print("Too low, try again ");
    }
    
  count++;
 } 
   System.out.print("You are correct. The number is: "+ randomNumber);   
}

}

