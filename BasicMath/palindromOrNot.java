package BasicMath;

public class palindromOrNot {
    public static void main(String[] args) {
        int n = 121;
        int dup = n;
        int reverseNumbe = 0;
        while(n>0){
            int lastdigit = n%10;
            n = n/10;
            reverseNumbe = (reverseNumbe*10)+lastdigit;
        }
        System.out.println(reverseNumbe);
        if(reverseNumbe==dup){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    
}
