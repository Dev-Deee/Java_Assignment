import java.util.Scanner;
public class SumOfIntegers{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter any number between 1 and 999: ");
    int number = input.nextInt();

    int divideOne = (number / 100);
    int divideTwo = (number % 10) / 10;
    int divideThree = number % 10;
    
    int sum = divideOne + divideTwo + divideThree;
    
    if(number > 999){
    System.out.println("invalid entry");
    }
    else{
    System.out.println("The sum of integer is: "+ sum);
    }
}
}
    
