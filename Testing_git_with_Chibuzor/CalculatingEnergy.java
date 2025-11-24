import java.util.Scanner;
public class CalculatingEnergy{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter amount of water in kilograms: ");
    double weightOfWater = input.nextDouble();
    System.out.print("Enter desired final Temperature: ");
    double finalTemperature = input.nextDouble();
    System.out.print("Enter initial Temperature: ");
    double initialTemperature = input.nextDouble();
    
    double energyToHeatWater = weightOfWater * (finalTemperature - initialTemperature) * 4184;
    
    
    System.out.println("Energy needed is : "+ energyToHeatWater);    
    
}
}
