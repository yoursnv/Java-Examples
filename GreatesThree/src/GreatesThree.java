            // Program to which no is Greatest!!
import java.util.Scanner;

class GreatesThree{
    
    public static void main(String args[]){
        
        //Input the values from the user bhai ji...lol!!!
        System.out.print("The First no is:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.print("Second no is:");
        Scanner obj2 = new Scanner(System.in);
        int b = obj2.nextInt();
        System.out.print("Third no is:");
        Scanner obj3 = new Scanner(System.in);
        int c = obj3.nextInt();
        
        // Now checking the condition which could be greater..Haha!!
        if(a<c && b<c){
            System.out.println( "Third no is greater: " +c);
        }
        else if(a<b && c<b){
            System.out.println("Second no is Greater:" +b);
        }
        else if(b<a && c<a){
            System.out.println("First no is Greater:" +a);
        }
        
    }
}