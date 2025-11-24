import java.util.Scanner;
public class MinutesToYears{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter minutes: ");
    int userInput = input.nextInt();
    
    int years = userInput / 525600;
    int minutesRemain = userInput % 525600;
    int days = minutesRemain / 1440;

    System.out.printf("%d minutes is approximately %d years and %d days  %n", userInput, years, days);
    
}
}
