package BasicMath;

public class extrctionOfDigit {
    public static void main(String[] args) {
        int n =1234567;
        while(n>0){
            int LastDigit = n%10;
            System.out.print(" "+LastDigit);
            n = n/10;
            
        }
    }
    
}
