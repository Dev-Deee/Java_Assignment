import java.util.Scanner;
public class LargestAndSmallestScore{
public static void main(String[]args){
Scanner input = new Scanner(System.in);


    System.out.print("Enter a score: ");
    int firstScore = input.nextInt();
    
    System.out.print("Enter a score: ");
    int secondScore = input.nextInt();
    
    System.out.print("Enter a score: ");
    int thirdScore = input.nextInt();
    
    System.out.print("Enter a score: ");
    int fourthScore = input.nextInt();
    
    System.out.print("Enter a score: ");
    int fifthScore = input.nextInt();
    
  int largestScore =firstScore;
  int smallestScore = firstScore;
    
    
    if (secondScore > largestScore){
        largestScore = secondScore;
    }
     
    if (thirdScore > largestScore){
            largestScore = thirdScore;
    }

    if (fourthScore > largestScore){
            largestScore = fourthScore;
    }
    if (fifthScore > largestScore){
            largestScore = fifthScore;
    }

    if (secondScore < smallestScore){
             smallestScore = secondScore;
    }
     
    if (thirdScore < smallestScore){
            smallestScore = thirdScore;
    }

    if (fourthScore < smallestScore){
            smallestScore = fourthScore;
    }
    if (fifthScore < smallestScore){
            smallestScore = fifthScore;
    }
        

        System.out.println("Largest Score is: "+ largestScore);
        System.out.println("Smallest Score is: "+ smallestScore);

















            }





}
