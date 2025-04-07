public class SubOfDigit {
    static int SOD(int n){
        if(n>=0 && n<=9){
            return n;
        }
        // recursive work 
        int smallAns = SOD(n/10);
        int  self = SOD(n%10);
        return smallAns+self;

    }
    public static void main(String[] args) {
        System.out.println(SOD(12345));
        
    }
    
}
