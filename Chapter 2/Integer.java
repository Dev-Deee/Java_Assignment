import java.util.Scanner;
public class Integer{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int number = input.nextInt();
    
    int numberSquare = number * number;
    
    if (number > 100){
    System.out.println("It is greater than 100");
    }

    if (number == 100){
    System.out.println("It is equal to 100");
    }

    if (number != 100){
    System.out.println("It is not equal to 100");
    }

    if (numberSquare < 100){
    System.out.println("It is less than 100");
    }

    if (numberSquare == 100){
    System.out.println("It is equal to 100");
    }
    }
}
