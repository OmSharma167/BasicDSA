// package Practice;
import java.util.*;
public class fibo {
    public static int Fiboseries(int n){
        if(n==0 || n==1){
            return n;
        } 
        int ans= Fiboseries(n-1) + Fiboseries(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Fiboseries(n-1));
        System.out.print(n);
        sc.close();


    }
    
}
