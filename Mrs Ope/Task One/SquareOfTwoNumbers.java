import java.util.Scanner;
public class SquareOfTwoNumbers{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.println(squareOfNumbers(3, 5));
    }

    public static int squareOfNumbers(int userInputOne, int userInputTwo){
        int sum = 0;
        for(int count = 1; count <= userInputTwo; count++){
                sum += userInputOne;
        }
        return sum;
    }
}
