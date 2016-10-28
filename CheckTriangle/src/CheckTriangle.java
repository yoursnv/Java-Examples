                            /*To check the properties of Triangle*/
import java.util.Scanner;

class CheckTriangle{
    public static void main(String args[]){
        
        // input the sides of the triangle
        System.out.println("Enter the 1st Side :");
        Scanner obj = new Scanner(System.in);
        int side1 = obj.nextInt();
        System.out.println("Enter the 2nd Side :");
        Scanner obj2 = new Scanner(System.in);
        int side2 = obj2.nextInt();
        System.out.println("Enter the 2nd Side :");
        Scanner obj3 = new Scanner(System.in);
        int side3 = obj3.nextInt();
        
        // now applying the condition wheather this or that
        if(side1==side2 && side2==side3){
            System.out.println("The triangle is equilitral!!");
        }
        else if((side1==side2 && side2!=side3) || (side3!=side1 && side2==side3) || (side1==side3) && (side1!=side2)){
            System.out.println("Triangle is Isoceles");
        }
        else if(side1!=side2 && side3!=side2){
            System.out.println("Triangle is an Scalen");
        }
    }

}
