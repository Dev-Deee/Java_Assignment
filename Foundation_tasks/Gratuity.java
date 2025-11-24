import java.util.Scanner;
public class Gratuity{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Income: ");
    double userIncome = input.nextDouble();
    System.out.print("Enter interest rate: ");
    double interestRate = input.nextDouble();
    
    double gratuitySubtotal = (userIncome * interestRate) / 100;
    double total = userIncome + gratuitySubtotal;

    System.out.printf("The gratuity is %f and total is %f meters  %n", gratuitySubtotal, total);
    }
}
