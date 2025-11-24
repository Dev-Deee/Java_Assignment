import java.util.Scanner;
public class MilesToKilometers{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter value for miles: ");
    double userInput = input.nextDouble();
    
    double KiloMeter = userInput * 1.6;

    System.out.printf("%f miles is %f Kilometer  %n", userInput, KiloMeter);
    }
}
