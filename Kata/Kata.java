public class Kata{
public static void main(String[]args){

}



public static int subtract(int userInputOne, int userInputTwo){
    int subtract=0;
    if (userInputOne > userInputTwo){
    subtract = userInputOne - userInputTwo;
    }

    else if (userInputOne < userInputTwo){
    subtract = userInputTwo - userInputOne;
    }
    
return subtract;
}



public static boolean isEven(int userInput){
    
    if (userInput % 2 == 0){
        return true;
    }
    else return false;

}



public static boolean isPalindrome(int userInputOne){
    int numberOne = userInputOne / 10000;
    int numberTwo = (userInputOne / 1000) %10;
    int numberThree = (userInputOne / 100) % 10;
    int numberFour = (userInputOne % 100) / 10;
    int numberFive= userInputOne % 10;

    if(numberOne == numberFive && numberTwo == numberFour){
        return true;
        }

    else {
        return false;
        }
}

public static boolean isSquare(int userInput){
        int squareRoot = (int)Math.sqrt(userInput);
        int  perfectSquare = squareRoot * squareRoot;
        if (perfectSquare == userInput){;
            return true;
        }else{ return false; 

            }
}


public static float divide(int userInputOne, int userInputTwo){
  float division = 0;
        if(userInputTwo == 0){
        System.out.print("0");
        }
        else
           division = (float)userInputOne / (float)userInputTwo;
return division;
}

public static long factorialOf(int userInput){
  
    int result = 1;
    int factorial = 1;
 for(int number = 1; number <= userInput; number++){
        result = number;
        factorial *= result;
        }
return factorial;
}


public static long squareOf(int userInputOne){

long result = userInputOne * userInputOne;
        System.out.println(result);


return result;
}



public static int factorOf(int userInput){
int number;
int count = 0;
for(number = 1; number <= userInput; number++){
        if (userInput % number != 0){
        count++;       
     }
   }
return count;
}




}
