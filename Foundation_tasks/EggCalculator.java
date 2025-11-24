import java.util.Scanner;
public class EggCalculator{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number of eggs: ");
    int numberOfEggs = input.nextInt();
    

    int oneDozen = 12;
    int gross = 12 * 12;
    int eggGross = numberOfEggs / gross;
    int eggDozen = numberOfEggs % gross / 12;
    int findingLeftOver = numberOfEggs - eggDozen * 144;
    int leftOver = findingLeftOver % 100;
    
    System.out.printf("%d eggs is approximately %d gross and %d dozen and %d left over  %n", numberOfEggs, eggGross, eggDozen, leftOver);
    
    }
}
