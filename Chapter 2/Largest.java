import java.util.Scanner;
public class Largest{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int numberOne = input.nextInt();
    System.out.print("Enter second number: ");
    int numberTwo = input.nextInt();
    System.out.print("Enter third number: ");
    int numberThree = input.nextInt();

    int sum = numberOne + numberTwo + numberThree;
    int product = numberOne * numberTwo * numberThree;
    int average = sum / 3;
    int largerNumber = numberOne;
    int smallerNumber = numberOne;

    if (numberTwo > largerNumber){
        largerNumber = numberTwo;
    }
    if (numberThree > largerNumber){
        largerNumber = numberThree;
    }
    if (numberTwo < smallerNumber){ 
        smallerNumber = numberTwo;
    }
    if (numberThree < smallerNumber) {
        smallerNumber = numberThree;
    }
    System.out.println("The Sum is "+ sum);
    System.out.println("The Product is " + product);
    System.out.println("The Average is "+ average);
    System.out.println("The largest number "+ largerNumber);
    System.out.println("The Smallest number "+ smallerNumber);
   
}
}
