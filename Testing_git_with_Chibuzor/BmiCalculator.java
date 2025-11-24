import java.util.Scanner;
public class BmiCalculator{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your weight in Pounds ");
    double weight = input.nextDouble();
    System.out.print("Enter your hieght in inches: ");
    double height = input.nextDouble();
    
    double heightSquare = height * height;
    double bmi = weight / heightSquare * 703;
    
    System.out.println("Bmi is: "+ bmi);  

   }
}
