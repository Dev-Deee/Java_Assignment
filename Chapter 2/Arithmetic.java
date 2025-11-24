import java.util.Scanner;
public class Arithmetic{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int numberOne = input.nextInt();
    System.out.print("Enter second number: ");
    int numberTwo = input.nextInt();

    int numberOneSquare = numberOne * numberOne;
    int numberTwoSquare = numberTwo * numberTwo;
    int sum = numberOneSquare + numberTwoSquare;
    int subtraction = numberOneSquare - numberTwoSquare;

    System.out.printf("Square of the fist entry is %d\n Square of the second entry is %d\n Sum of their square is %d\n Subtractin of their square is %d\n " , numberOneSquare, numberTwoSquare, sum,  subtraction);

    }
}
