                //Program to swap two numbers with each other!!
class SwapNumbers{
    public static void main(String[] args) {
        // initilize 2 numbers.
        int num1 =10;
        int num2 =20;
        System.out.println("Numbers before Swapping:");
        System.out.println("Number1: " +num1);
        System.out.println("Number2: " +num2);
        
        swap(num1, num2);
}
    public static void swap(int num1, int num2){
        // now using the temp value to swap between the 2 numbers!!
        int temp =num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swaping:");
        System.out.println("Number1: " +num1);
        System.out.println("Number2: " +num2);
    }
}