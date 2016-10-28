/* Program to find the area of triangle*/
import java.util.Scanner;

class AoTriangle{
    
    public static void main(String args[]){
        
        //Accept side from user
        System.out.println("Enter the base of Triangle:");
        Scanner obj1 = new Scanner(System.in);
        double base = obj1.nextDouble();
        
        System.out.println("Enter the hieght of Triangle:");
        Scanner obj2 = new Scanner(System.in);
        double height = obj2.nextDouble();
        
        System.out.println("Enter hypotenues of Triangle:");
        Scanner obj3 = new Scanner(System.in);
        double hypot = obj3.nextDouble();
        
        Double area;
        area = (double) (base * height * hypot);
        System.out.println("Area of Triangle is: " +area);
    }
}