import java.util.Scanner;
public class CompareFiveInteger{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int numberOne = input.nextInt();
    System.out.print("Enter second number: ");
    int numberTwo = input.nextInt();
    System.out.print("Enter third number: ");
    int numberThree = input.nextInt();
    System.out.print("Enter four number: ");
    int numberFour = input.nextInt();
    System.out.print("Enter fifth number: ");
    int numberFive = input.nextInt();

    int largerNumber = numberOne;
    int smallerNumber = numberOne;

    if (numberTwo > largerNumber){
        largerNumber = numberTwo;
    }
    if (numberThree > largerNumber){
        largerNumber = numberThree;
    }
    if (numberFour > largerNumber){
        largerNumber = numberFour;
    }
    if (numberFive > largerNumber){
        largerNumber = numberFive;
    }
    if (numberTwo < smallerNumber){ 
        smallerNumber = numberTwo;
    }
    if (numberThree < smallerNumber){
        smallerNumber = numberThree;
    }
    if (numberFour < smallerNumber){ 
        smallerNumber = numberFour;
    }
    if (numberFive < smallerNumber){
        smallerNumber = numberFive;
    }
    System.out.println("The largest number "+ largerNumber);
    System.out.println("The Smallest number "+ smallerNumber);
}
}
