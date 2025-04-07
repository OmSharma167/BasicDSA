public class Factorial {
    // subproblenm = f(n-1)
    // self work = n*f(n-1) -> recursive work
    // base case = if(n==0){
    //     return 1;
    // }\
    static int factorial(int n){
        // base case
        if(n==0){
            return 1;
        }
        // recursive work = smaller problem
        //int smallAns=factorial(n-1);// factrial 4 = 24

        // self work
        //int ans  = n*smallAns;
        return n*factorial(n-1);

    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
    
}
/*
 *  f(5) = 5*f(4)
 *             4*f(3)
 *                 3*f(2)
 *                       2*f(1)
 *                            1*f(0)
 */
