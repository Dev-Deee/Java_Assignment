import java.util.Scanner;
public class NegativeNumbers{
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

    int negativeNumber = 0;
    int positiveNumber = 0;
    int zeroValue = 0;

    if (numberOne < negativeNumber){
        negativeNumber = numberOne;
    }    
    if (numberTwo < negativeNumber){
        negativeNumber = numberTwo;
    }
    if (numberThree < negativeNumber){
        negativeNumber = numberThree;
    }
    if (numberFour < negativeNumber){
        negativeNumber = numberFour;
    }
    if (numberFive < negativeNumber){
        negativeNumber = numberFive;
    }
    if (numberOne > positiveNumber){
        negativeNumber = numberOne;
    }    
    if (numberTwo > positiveNumber){
        negativeNumber = numberTwo;
    }
    if (numberThree > positiveNumber){
        negativeNumber = numberThree;
    }
    if (numberFour > positiveNumber){
        negativeNumber = numberFour;
    }
    if (numberFive > positiveNumber){
        negativeNumber = numberFive;
    }
    if (numberOne == zeroValue){ 
        zeroValue = numberTwo;
    }
    if (numberTwo == zeroValue){ 
        zeroValue = numberTwo;
    }
    if (numberThree == zeroValue){
        zeroValue= numberThree;
    }
    if (numberFour == zeroValue){ 
        zeroValue = numberFour;
    }
    if (numberFive == zeroValue){
        zeroValue = numberFive;
    }
    
    System.out.println("It is a Po number ");
    System.out.println("It is a Positive number ");
    System.out.println("it is equal to Zero");
}
}
