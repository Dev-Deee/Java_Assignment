import java.util.Arrays;
public class SortTheArray{
    public static void main(String[]args){

    int [] userInput = {-6, 7, -9, -10};
    System.out.println(Arrays.toString(sortArray(userInput)));
    }

    //  public static int[] sortArray(int[] userInput){
    //     for(int count = 0; count < userInput.length -1; count++){
    //         for(int index = 0; index < userInput.length -1; index++){
    //             if(userInput[index] > userInput[index+1]){
    //                 int subtract = userInput[index] - userInput[index + 1];
    //                 userInput[index + 1] += subtract;
    //             }
    //         }
    //     }
    // return userInput;
    // }

    public static int[] sortArray(int[] userInput) {
    for(int index = 0; index < userInput.length - 1; index++) {
        for(int count = 0; count < userInput.length - 1 - index; count++) {
            if(userInput[count] > userInput[count + 1]) {
                userInput[count] = userInput[count] + userInput[count + 1];
                userInput[count + 1] = userInput[count] - userInput[count + 1];
                userInput[count] = userInput[count] - userInput[count + 1];
            }
        }
    }
    return userInput;
}
}
