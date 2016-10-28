import java.util.Scanner;

class PrimeNumber{
        
        public static void main(String args[]){
            int n, temp , num;
            boolean isPrime = true;
            System.out.println("Enter the number that you need to check:");
            Scanner obj = new Scanner(System.in);
            num = obj.nextInt();
            
            for(int i=2; i<=num/2; i++){
                temp = num%2;
                if(temp==0){
                    isPrime = false;
                    break;
                }
            }
                if(isPrime){
                    System.out.println("prime");
                }
                else{
                    System.out.println("Not a prime");
                }
            }
        }