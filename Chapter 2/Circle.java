import java.util.Scanner;
public class Circle{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    double pi = Math.PI;

    System.out.print("Enter radius: ");
    double radius = input.nextDouble();

    double diameter = radius * 2;
    double circumference = (radius * pi) * 2;
    double areaOfCircle = (radius * radius) * pi;
    
System.out.printf("The diameter is: %f%nCircumference of a circle: %f%nArea of circle: %f%n", diameter, circumference, areaOfCircle);   
    }
}
