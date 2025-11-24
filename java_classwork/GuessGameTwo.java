import java.util.Scanner;
import java.util.Random;
public class GuessGameTwo{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
Random random = new Random();

int randomNumber = random.nextInt(3);

System.out.println("Enter a number: ");
int guessNumber = input.nextInt();

while (guessNumber != randomNumber){
     
   for(int count= 0; count < 3; count++){ 

        if (guessNumber < randomNumber){
        System.out.println("Too low. Try again");
            }

        else if (guessNumber > randomNumber){
        System.out.println("too high. Try again");
            }
        else if (guessNumber == randomNumber){
        System.out.println("You won");    
            }
    
            System.out.println("Enter a number: ");
            guessNumber = input.nextInt();
                }
            }

        
     System.out.println("you won, the number is: "+ randomNumber);
  
    }


}


