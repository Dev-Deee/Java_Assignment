import java.util.Scanner;
public class PoundsToKilograms{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter value for Pounds: ");
    double userInput = input.nextDouble();
    
    double Kilograms = userInput * 0.454;

    System.out.printf("%f pounds is %f kilograms  %n", userInput, Kilograms);
    
}
}
