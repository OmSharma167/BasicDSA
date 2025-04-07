package BasicMath;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 98765;
        int rever = 0;
        while(n>0){
            int lastNum = n%10;
            n=n/10;
            rever = (rever*10)+lastNum;

        }
        System.out.println(rever);
    }
    
}
