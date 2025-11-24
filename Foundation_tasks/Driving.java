import java.util.Scanner;
public class Driving{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter distance to drive: ");
    double distance = input.nextDouble();
    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = input.nextDouble();
    System.out.print("Enter price per gallon: ");
    double pricePerGalon = input.nextDouble();
    
    double costOfDriving = (distance / milesPerGallon) * pricePerGalon ;
    
    
    System.out.print("The cost of driving is : "+ costOfDriving);    
    }
}
