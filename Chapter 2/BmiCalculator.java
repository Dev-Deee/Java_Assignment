import java.util.Scanner;
public class BmiCalculator{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your weight in kilograms: ");
    double weight = input.nextDouble();
    System.out.print("Enter your hieght in meters: ");
    double hieght = input.nextDouble();

    double bmi = weight / hieght * hieght;

    if (bmi < 18.5) {
    System.out.println("Your BMI is: " + bmi);
    System.out.println("You are Underweight");
    } 
    else if (bmi < 25.0) {
    System.out.println("Your BMI is: " + bmi);
    System.out.println("You are Normal");
    } 
    else if (bmi < 30.0) {
    System.out.println("Your BMI is: " + bmi);
    System.out.println("You are Overweight");
    } 
    else
    {
    System.out.println("Your BMI is: " + bmi);
    System.out.println("You are Obese");
    } 
   }
}
