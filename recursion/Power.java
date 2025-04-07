public class Power {
    static int power(int p,int q){
        // base case
        if(q==0){
            return 1;
        }
        // recursive work, self work
        return power(p, q-1)*p;// p^q-1 * p=p^q

    }
    public static void main(String[] args) {
        System.out.println(power(5,4));
        
    }
    
}
