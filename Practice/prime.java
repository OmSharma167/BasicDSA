// package Practice;
import java.util.*;

public class prime {

    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    // n = 7 m =15
    public static ArrayList<Integer>  Prime(int n,int m){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n; i<=m;i++){
            if(isprime(i)){
                list.add(i);
            }
        }return list;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Prime(n,m));
        sc.close();
        


    }
    
}
