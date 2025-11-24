import java.util.Scanner;
public class WhileLoopRandom{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter a number: ");
    int firstInput = input.nextInt();
    
    System.out.print("Enter a number: ");
    int secondInput = input.nextInt();

    int count = 1;

    do{ 
    sum = firstInput + secondInput;
    System.out.print("Do you want you want to continue "); 
    boolean isTrue = True;
    
    System.out.print("Enter a number: ");
    int firstInput = input.nextInt();
    
    System.out.print("Enter a number: ");
    int secondInput = input.nextInt();
    
    count += 1;
      
    }while(isTrue);  
 } 
   System.out.print();   
}

}
