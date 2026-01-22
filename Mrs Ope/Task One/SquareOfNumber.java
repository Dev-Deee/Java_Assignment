import java.util.Scanner;
public class SquareOfNumber{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    int userInput = input.nextInt();

    int square = userInput * userInput;

    System.out.println(square);

    }
}
