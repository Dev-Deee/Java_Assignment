//import java.util.*;
import java.util.Scanner;
//import java.util.Random;
public class RollingDice{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    System.out.println("Enter first number from 1 to 6: ");
    int firstRoll = random.nextInt(1,7);
    int firstNumber = input.nextInt();
    System.out.println("Enter second number from 1 to 6: ");
    int secondRoll = random.nextInt(1,7);

    int sum = firstRoll + secondRoll;

    if(firstRoll !=firstNumber){
    System.out.println("SHARP");
    }
   
    System.out.printf("First dice is: %d%nSecond roll is: %d%nYour total roll is  %d%n", firstRoll, secondRoll, sum);    
    
   }
}
