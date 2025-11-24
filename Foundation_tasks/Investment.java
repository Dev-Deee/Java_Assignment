import java.util.Scanner;
public class Investment{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    System.out.print("Enter monthly interest rate: ");
    double monthlyInterest = input.nextDouble();
    System.out.print("Enter number of years: ");
    double numberOfYears = input.nextDouble();
    
    double monthlyInterestRate = (monthlyInterest / 100) /12;
    double years = (numberOfYears * 12);
    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years);
    
    
    System.out.println("Accumulated value is: "+ futureInvestmentValue);    
    }
}
