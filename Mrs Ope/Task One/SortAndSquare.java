import java.util.Arrays;
public class SortAndSquare{
    public static void main(String[]args){

    int [] input = {-6, 7, -9, -10};
    System.out.println(Arrays.toString(sortAndSquareArray(input)));
    }

    public static int[] sortArray(int[] userInput){
        int temporaryStorage = 0;
        for(int index = 0; index < userInput.length; index++){
            for(int count = 0; count < userInput.length-1; count++){
                if(userInput[count] > userInput[count+1]){
                    temporaryStorage = userInput[count];
                    userInput[count] = userInput[count+1];
                    userInput[count+1] = temporaryStorage;
                }
            }
        }
        return userInput;
        }

     public static int[] calculateSquareOfArray(int[] userInput){
        int[] sortedArray = new int [userInput.length];
        for(int position = 0; position < userInput.length; position++){
            sortedArray[position] = userInput[position] *  userInput[position] ;
        }   
        return sortedArray;
    }

    public static int[] sortAndSquareArray(int[] userInput){
        int[] sortArray = sortArray(userInput);
        int[] calculateSquareOfArray = calculateSquareOfArray(sortArray);
        return calculateSquareOfArray;
    }

}
