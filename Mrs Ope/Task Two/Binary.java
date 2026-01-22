//psuedo code:
//
//collect userInput
//check if it is a negative value
//multiply with -1 if lesser than 0
//store it
//store userInput in another variable
//divide variable with modulo
//store the remainder
//divide variable again
//store it
//repeat


public class Binary{
    public static void main(String[]args){
    
        System.out.println(convertToBinary(-10));
        System.out.println(convertFromBinary(1010));
    }

    public static String convertToBinary(int userInput){
        if(userInput < 0){
             userInput = userInput * -1; 
        }
        int convertToBinary = userInput;
        String binary = "";
        while(convertToBinary != 0){
            int remainder = convertToBinary % 2;
            binary = remainder + binary;
            convertToBinary /= 2; 
        }
        return binary;
    }

    public static int convertFromBinary(int userInput){
        if(userInput < 0){
             userInput = userInput * -1; 
        }
        String digit = "" + userInput;
        int convertToBinary = userInput;
        int calculate = 0;
        for(int index = 0; index < digit.length(); index++){
            int remainder = convertToBinary % 2;
            calculate  += remainder * Math.pow(2,index);
            convertToBinary /= 10; 
        }
        return calculate;
    }

}
