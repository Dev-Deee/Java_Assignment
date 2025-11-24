public class WorldPopulation{
    public static void main(String[]args){
    
    double initialPopulation = 500000;
    double yearlyPercentageGrowth = 0.0085;
    
    double yearOne = (initialPopulation * yearlyPercentageGrowth) + initialPopulation;
    double yearTwo = (yearOne * yearlyPercentageGrowth) + yearOne;
    double yearThree = (yearTwo * yearlyPercentageGrowth) + yearTwo;
    double yearFour = (yearThree * yearlyPercentageGrowth) + yearThree;
    double yearFive = (yearFour * yearlyPercentageGrowth) + yearFour;
    
    System.out.println("Year one is: "+ yearOne);
    System.out.println("Year Two is: "+ yearTwo);
    System.out.println("Year Three is: "+ yearThree);
    System.out.println("Year Four is: "+ yearFour);
    System.out.println("Year Five is: "+ yearFive);

} 
}
