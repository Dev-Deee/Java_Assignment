import java.util.Scanner;
//import java.util.Random;
public class GuessGame{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
//Random input = new Random(100);

int fixedNumber = 100;


System.out.println("Enter a number: ");
int guessNumber = input.nextInt();

while (guessNumber != fixedNumber){
           
    if (guessNumber < fixedNumber){
        System.out.println("Too low. Try again");
    }

    else if (guessNumber > fixedNumber){
        System.out.println("too high. Try again");
    }
    else if (guessNumber == fixedNumber){
        System.out.println("You won");    
    }
    
    System.out.println("Enter a number: ");
    guessNumber = input.nextInt();
    
        }
    
     System.out.println("you won, the number is: "+ fixedNumber);
  
    }


}


