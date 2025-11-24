
import java.util.Scanner;
public class AverageAcceleration{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter start velocity in meters: ");
    double startVelocity = input.nextDouble();
    System.out.print("Enter ending velocity in meters: ");
    double acceleration = input.nextDouble();
    System.out.print("Enter time span in seconds: ");
    double time = input.nextDouble();
    
    double acceleration = (startVelocity - endingVelocity) / time;
    
    System.out.println("The average acceleration is : "+ acceleration);
    }
}
