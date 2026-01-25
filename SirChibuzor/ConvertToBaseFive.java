public class ConvertToBaseFive {
    public static void main(String[] args){

        int userInput = 10;
        int fromBase = 5;
        int toBase = 32;

        convertBase(userInput, fromBase, toBase);
    }

    public static void convertBase(int userInput, int fromBase, int toBase){
        if (!baseConditionerStatus(userInput, fromBase)) {
            System.out.println("Invalid Input for the base " + fromBase);
        }
        else{
            int convertFromBase = convertFromBase(userInput, fromBase);
            String convertToBase = convertToBase(convertFromBase, fromBase, toBase);
            System.out.printf("%d in base %d is: %s\n" ,userInput , fromBase, convertToBase);
        }
    }
    public static int convertFromBase(int userInput, int fromBase){

        if(userInput ==  0){
            return 0;
        }
        if(userInput < 0){
             userInput = userInput * -1; 
        }

        String digit = "" + userInput;
        int convertToBinary = userInput;
        int baseTenValue = 0;

        for(int index = 0; index < digit.length(); index++){
            int remainder = convertToBinary % 10;
            baseTenValue  += remainder * mathPow(fromBase, index);
            convertToBinary /= 10; 
        }
        return baseTenValue;
    }

    public static String convertToBase(int userInput, int fromBase, int toBase){
        String baseResult = "";
        int convertToBinary = userInput;
        while(convertToBinary != 0){
            int remainder = convertToBinary % toBase;
            baseResult = remainder + baseResult;
            convertToBinary /= toBase; 
        }
        return baseResult;
    }
    
    public static int mathPow(int number, int exponential){
        int result = 1;
        for(int count = 1; count <= exponential; count++){
            result *= number  ;
        }
        return result;
    }

    public static boolean baseConditionerStatus(int userInput, int fromBase) {
        String digit = "" + userInput;
        int sum = 0;
        for(int count = 0; count < digit.length(); count++){
            int remainder = userInput % 10;
            sum = remainder;
            userInput /= 10; 
        }
        if(sum >= fromBase) {
            return false;
        }
        else 
            return true;
    }

    public static int convertToChar(int number){

        
    }
}

