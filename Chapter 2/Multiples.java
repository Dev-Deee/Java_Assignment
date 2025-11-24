import java.util.Scanner;
public class Multiples{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int numberOne = input.nextInt();
    System.out.print("Enter second number: ");
    int numberTwo = input.nextInt();
    
    int numberTripled = numberOne * 3;
    int numberDoubled = numberOne * 2;
    int multiple = numberTripled % numberDoubled;
    
    if (multiple == 0){
    System.out.printf("it is divisible");
    }
    else
    {
        System.out.printf("it is not divisible");
    }
   }
}
