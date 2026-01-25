public class ConvertToBaseFive {
    public static void main(String[] args){

        int userInput = 20;
        int frombase = 2;
        int convertToBase = Integer.parseInt(convertToBase(20, 2, 5));
        System.out.printf("%d in base %d is: %d" ,userInput , frombase, convertToBase);
    }

    public static String convertToBase(int userInput,int fromBase, int toBase){

        if(userInput ==  0){
            return "0";
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

        String baseResult = "";
        while(baseTenValue != 0){
            int remainder = baseTenValue % toBase;
            baseResult = remainder + baseResult;
            baseTenValue /= toBase; 
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
}

