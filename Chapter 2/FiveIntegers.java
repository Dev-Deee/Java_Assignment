import java.util.Scanner;
public class FiveIntegers{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int number = input.nextInt();

    int divideOne = number / 10000;
    int divideTwo = (number / 1000) %10;
    int divideThree = (number / 100) % 10;
    int divideFour = (number % 100) / 10;
    int moduloFive= number % 10;
    
    System.out.printf("%d   ", divideOne);
    System.out.printf("%d   ", divideTwo);
    System.out.printf("%d   ", divideThree);
    System.out.printf("%d   ", divideFour);
    System.out.printf("%d%n   ", moduloFive);

}
}
