import java.util.Scanner;
public class ConvertToMeter{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter value for feet: ");
    double userInput = input.nextDouble();
    
    double meter = userInput * 0.305;

    System.out.printf("%f feet is %f meters  %n", userInput, meter);
    
}
}
