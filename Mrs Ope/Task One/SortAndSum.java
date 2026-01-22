import java.util.Arrays;
public class SortAndSum{
    public static void main(String[]args){

    int[][] input = {{5,6}, {7,1}, {3, 2}};
   System.out.println(Arrays.toString(sumAndSortTheArray(input)));

    }
    public static int[] calculateSumOfArray(int[][] userInput){
        int[] sumOfArray = new int [userInput.length];
        for(int count = 0; count < userInput.length; count++){
            int sum = 0;
            for(int index = 0; index < userInput[0].length; index++){
                sum += userInput[count][index];
            }
            sumOfArray[count] = sum;
        }
    return sumOfArray;
    }

    // public static int[] sortArray(int[] userInput){
    //     int temporaryStorage = 0;
    //     for(int index = 0; index < userInput.length; index++){
    //         for(int count = 0; count < userInput.length-1; count++){
    //             if(userInput[count] > userInput[count+1]){
    //                 temporaryStorage = userInput[count];
    //                 userInput[count] = userInput[count+1];
    //                 userInput[count+1] = temporaryStorage;
    //             }
    //         }
    //     }
    //     return userInput;
    // }

    public static int[] sumAndSortTheArray(int[][] userInput){
        int[] calculateSumOfArray = calculateSumOfArray(userInput);
        int[] sortedArray = SortAndSquare.sortArray(calculateSumOfArray);
    return sortedArray;
    }

}
