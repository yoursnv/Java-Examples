        // Bhai ji This program is for Fibonacci Series
import java.util.Scanner;

class FibonacciSeries{
    
    public static void main(String args[]){
        
        // initialize the values and count for no. of series!!
        int a=0;
        int b=1,c, i, count;
        //System.out.println(a+b);
        System.out.println("Enter the limit:");
        Scanner obj = new Scanner(System.in);
        count = obj.nextInt();
                
        //now by for loop we will increment the values.
        for(i=0;i<count;i++){
            c=a+b;
            System.out.println("The output is:" +c);
            a=b;
            b=c;
        }
    }
}