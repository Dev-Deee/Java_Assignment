import java.util.Scanner;
public class CalculateInvestment{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    System.out.print("Enter yearly interest rate: ");
    double yearlyInterest = input.nextDouble();
    System.out.print("Enter number of years: ");
    double numberOfYears = input.nextDouble();
    
    double monthlyInterestRate = (yearlyInterest / 100) /12;
    double years = (numberOfYears * 12);
    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years);
    
    
    System.out.println("Accumulated value is: "+ futureInvestmentValue);    
    }
}
