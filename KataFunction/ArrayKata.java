import java.util.Arrays;
public class ArrayKata{
    public static void main(String[]args){

     int number = 9;
     int numbers = 5;
     int test = 121;
     int[] arrayOfIntegers = {1,2,3,4,5,6,7,8,9,10}; 

    System.out.println(maximumIn(arrayOfIntegers));
    System.out.println(minimumIn(arrayOfIntegers));
    System.out.println(sumOfArray(arrayOfIntegers));
    System.out.println(sumOfEvenNumbers(arrayOfIntegers));
    System.out.println(sumOfOddNumbers(arrayOfIntegers));
    System.out.println(Arrays.toString(MinimumAndMaximumOfArray(arrayOfIntegers)));
    System.out.println(noOfOddNumbersIn(arrayOfIntegers));
    System.out.println(noOfEvenNumbersIn(arrayOfIntegers));
    System.out.println(Arrays.toString(evenNumbersIn(arrayOfIntegers)));
    System.out.println(Arrays.toString(oddNumbersIn(arrayOfIntegers)));
    System.out.println(Arrays.toString(squareNumbersIn(arrayOfIntegers)));
    }

    public static int maximumIn(int[] userInput){
        int largest = userInput[0];
        for(int count = 0; count < userInput.length; count++){
            if(userInput[count] > largest){
                largest = userInput[count];        
            }
        }
            return largest;
    }

    public static int minimumIn(int[] userInput){
            int smallest = userInput[0];
            for(int count = 0; count < userInput.length; count++){
                if(userInput[count] < smallest){
                    smallest = userInput[count];        
                }
            }
                return smallest;
        }

    public static int sumOfArray(int[] userInput){
            int sum = 0;
            for(int count = 0; count < userInput.length; count++){
               sum += userInput[count] ;
            }
                return sum;
        }

    public static int sumOfEvenNumbers(int[] userInput){
            int sum = 0;
            for(int count = 0; count < userInput.length; count++){
                    if(userInput[count] % 2 == 0)
                        sum += userInput[count] ;
            }
                return sum;
        }
    public static int sumOfOddNumbers(int[] userInput){
            int sum = 0;
            for(int count = 0; count < userInput.length; count++){
                    if(userInput[count] % 2 != 0)
                        sum += userInput[count] ;
            }
                return sum;
        }

    public static int[] MinimumAndMaximumOfArray(int[] userInput){
        int largest = userInput[0];
        int smallest = userInput[0];
        int[] newArray = new int [2];
        for(int count = 0; count < userInput.length; count++){
                if(userInput[count] > largest){
                    largest = userInput[count] ;
                    newArray[0] = largest;
                 }
                if(userInput[count] <= smallest){
                    smallest = userInput[count] ;
                    newArray[1] = smallest;
                }
        }
            return newArray;
    }
    public static int noOfOddNumbersIn(int[] userInput){
            int counter = 0;
            for(int count = 0; count < userInput.length; count++){
                      if(userInput[count] % 2 != 0){
                            counter += 1;
                        }
            }
                return counter;
        }

    public static int noOfEvenNumbersIn(int[] userInput){
            int counter = 0;
            for(int count = 0; count < userInput.length; count++){
                      if(userInput[count] % 2 == 0){
                            counter += 1;
                        }
            }
                return counter;
        }

    public static int[] evenNumbersIn(int[] userInput){
        int counter = 0;
        int[] newArray = new int [noOfEvenNumbersIn(userInput)];
        for(int count = 0; count < userInput.length; count++){
                if(userInput[count] % 2 == 0){
                    newArray[counter] =userInput[count] ;
                    counter++;
                }
        }
            return newArray;
    }

    public static int[] oddNumbersIn(int[] userInput){
        int[] newArray = new int [noOfOddNumbersIn(userInput)];
        int counter = 0;
        for(int count = 0; count < userInput.length; count++){
                if(userInput[count] % 2 != 0){
                    newArray[counter] =userInput[count] ;
                    counter++;
                }
        }
            return newArray;
    }

    public static int[] squareNumbersIn(int[] userInput){
        int[] newArray = new int [userInput.length];
        for(int count = 0; count < userInput.length; count++){
                int square = userInput[count] * userInput[count];
                    newArray[count] =square ;
        }
            return newArray;
    }

    }
