import java.util.Scanner;
public class EvenOddNumbers{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter any number from 1 to 40: ");
    int userInputOne = input.nextInt();
    System.out.print("Enter another number from 1 to 40: ");
    int userInputTwo = input.nextInt();
    System.out.print("Enter another number from 1 to 40: ");
    int userInputThree = input.nextInt();
    
    int divisionOne = userInputOne % 2;
    int divisionTwo = userInputTwo % 2;
    int divisionThree = userInputThree % 2;
    

    if(divisionOne == 0 && divisionTwo == 0 && divisionThree == 0){
    System.out.println("");    
    }
    else{
    System.out.println("Out of range");    
    }
}
}
