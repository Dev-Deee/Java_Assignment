import java.util.Scanner;
public class ArrangeInteger{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter any number between 1 and 9999: ");
    int number = input.nextInt();

    int divideOne = number / 1000;
    int divideTwo = (number / 100) % 10;
    int divideThree = (number % 100) / 10;
    int divideFour = number % 10;
    
    System.out.printf("Reversed number is: "+ divideFour+ divideThree+ divideTwo+ divideOne);
     }
}
    
