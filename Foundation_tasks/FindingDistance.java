import java.util.Scanner;
public class FindingDistance{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter start velocity in meters: ");
    double startVelocity = input.nextDouble();
    System.out.print("Enter acceleration: ");
    double acceleration = input.nextDouble();
    System.out.print("Enter time span in seconds: ");
    double time = input.nextDouble();
    
    double distance = (startVelocity + time + acceleration);

    System.out.println("The distance covered is: "+ distance);
    }
}
