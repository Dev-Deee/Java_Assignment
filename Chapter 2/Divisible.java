import java.util.Scanner;
public class Divisible{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int numberOne = input.nextInt();
    int divisible = numberOne % 3;
    
    if (divisible == 0){
    System.out.printf("it is divisible by 3");
    }
    else
    {
        System.out.printf("it is not divisible by 3");
    }
   }
}
