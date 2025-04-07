package BasicMath;

public class OrmostrangOrNot {
    public static void main(String[] args) {
        int  n =371;
        int temp = n;
        int ans = 0;
        while(n>0){
            int lastdigit = n%10;
            ans  = ans+lastdigit*lastdigit*lastdigit;
            n = n/10;
            
        }
        System.out.println(ans);
        if(ans == temp){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
