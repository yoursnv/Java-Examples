import java.util.*;

class ReversePrint{
    
    int i;
    public static void main(String argsp[]){
        //taking input from the user!!
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = obj.nextInt();
        //creating the fOR loop
        for(; i>=0; i--){
            System.out.println("The values are:" +i);
        }
    }
}