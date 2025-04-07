public class NnaturalNumber {
    static void pi(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        // yeha per sout kr denge to n to 1
        pi(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n = 5;
        pi(n);

        
    }
    
}
