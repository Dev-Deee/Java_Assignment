import java.util.Arrays;
public class Sort{
    public static void main(String[]args){

    int [] input = {-6, 7, -9, -10};
    System.out.println(Arrays.toString(sortArray(input)));
    }

    public static int[] sortArray(int[] userInput){
        int temporaryStorage = 0;
        int left = 0;
        int right = userInput.length -1;
        int count = 0;
        while(left < right){
        if(userInput[count] > userInput[count+1]){
            temporaryStorage = userInput[count];
            userInput[count] = userInput[count+1];
            userInput[count+1] = temporaryStorage;
            left++;
            right--;
          }  
        count++;
        }
        return userInput;
        }
}
