import java.util.Scanner;
public class PrimeNumbers{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a number ");
int userNumber = input.nextInt();

    int flag = 0;
if( userInput == 0 || userInput == 1){
    System.out.println(userNumber+ " is not a prime number");
    } 

    else{
    int divideNumbers = userInput / 2;
    for(primeNumber = 2; primeNumber <= divideNumber; primeNumber++){
    System.out.println(UserInput + "is not a prime number");
    flag = 1;
    break;
    }
    }

    if( flag == 0){
        system.out.println(UserInput + "is a prime number");
    }

}
}



