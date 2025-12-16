public class Kata{
    public static void main(String[]args){

     int number = 9;
     int numbers = 5;
     int test = 121;
    System.out.println(isEven(number));
    System.out.println(isPrime(number));
    System.out.println(subtract(number, numbers));
    System.out.println(divide(number, numbers));
    System.out.println(factorOf(number));
    System.out.println(isSquare(number));
    System.out.println(isPalindrome(test));
    System.out.println(factorial(numbers));
     System.out.println(squareOf(numbers));
   

    }

    public static boolean isEven(int userInput){
        if( userInput % 2 ==0){
            return true;
        }
    else 
            return false;
    }

    public static boolean isPrime(int userInput){
        int factors = 0;
        for(int count = 1; count <= userInput; count++){
               if( userInput % count == 0){
                    factors += 1;                
                }
        }
                 if( factors == 2){
                        return true;                
                }
               else 
                       return false;
    }

    public static int subtract(int userInput, int userInputTwo){
        int subtraction = 0;
        if(userInput < userInputTwo){
            subtraction =userInputTwo - userInput;
        }
        else if( userInputTwo < userInput){
            subtraction = userInput - userInputTwo;        
        }
         return subtraction;
    }

    public static float divide(int userInput, int userInputTwo){
        float division = 1;
        if(userInputTwo == 0)
                return 0;
        else 
                return division = userInput / userInputTwo;
    }
       
    public static int factorOf(int userInput){
        int factors = 0;
        for(int count = 1; count <= userInput; count++){
                if(userInput % count == 0)
                    factors +=1;
        }
            return factors;
    }

    public static boolean isSquare(int userInput){
        int counter = 0;
        for(int count = 1; count < userInput; count++){
                if( count * count == userInput){
                        counter += 1;
                }
         }
                if ( counter == 1){
                        return true;
                }
               else  
                         return false;    
    } 


    public static boolean isPalindrome(int userInput){
        int remainder = 0;
        int reverse = 0;
        int newNumber = userInput;
        while(newNumber != 0){
            remainder = newNumber % 10;
            reverse = reverse * 10 + remainder;
            newNumber/=10;
        }

            if(reverse == userInput)
                    return true;
            else
                    return false;
    }

    public static long factorial(int userInput){
        int factorial = 1;
        for(int count = userInput; count >= 1; count--){
                factorial *=count;
        }            
                return factorial;
    }

    public static int squareOf(int userInput){
//        int square =1;
       int square = userInput * userInput;
        return square;
    }

}
