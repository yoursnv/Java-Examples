/* program to find area of square */
import java.util.Scanner;

class AoSquare{

        public static void main(String [] args){
            
            System.out.println("Enter the height of square to find area:");
            Scanner obj1 = new Scanner(System.in);
            double height = obj1.nextDouble();
            
            Double area = (double)(height * height);
            System.out.println("Area of square is: " +area);
            
            System.out.println("Enter the side of square to find perimeter:");
            Scanner obj2 = new Scanner(System.in);
            double side = obj2.nextDouble();
            
            Double Perimeter = (double) (4*side);
            System.out.println("Perimeter of Square is: " +Perimeter);
        }

}