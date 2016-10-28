class HalfStar{
    
    public static void main(String[] args) {
        // initialize two values:
        int i,j;
            
        // applying for loop
        for(i=1; i<=5; i++){
        // applying another loop
            for(j=2; j<=i; j++){ // if you want for opposite stars then put j=4, j>=i, j--

                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}