import java.util.Scanner;
public class CalculateInterest{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter balance: ");
    double balance = input.nextDouble();
    System.out.print("Enter annual interest rate: ");
    double annualInterest = input.nextDouble();
    
    
    double interest = balance * (annualInterest/1200);
    
    
    System.out.println("The interest is: "+ interest);  
    }
}
