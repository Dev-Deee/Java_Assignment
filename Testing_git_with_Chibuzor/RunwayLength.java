import java.util.Scanner;
public class RunwayLength{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter airplane speed in meters per second: ");
    double airplaneSpeed = input.nextDouble();
    System.out.print("Enter airplane accelerationin meters per second: ");
    double airplaneAcceleration = input.nextDouble();

    double accelerationSquare = airplaneAcceleration * 2;
    double SpeedSquare = airplaneSpeed* airplaneSpeed;
    double runwayLength = SpeedSquare / accelerationSquare;
    
    
    System.out.print("The minimun runway length for this airplane is: %n"+ runwayLength);    
    
}
}
