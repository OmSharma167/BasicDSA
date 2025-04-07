// package Practice;

import java.util.*;

public class singlnumber {
    public static int sinle(int[] arr,int n){
        int xor  = 0;
        for(int i = 0;i<n;i++){
            xor ^= arr[i];
        }return xor;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        // System.out.println("Enter the elements of array:");
        for(int i = 0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int ans = sinle(arr,n);
        // System.out.println("This is your ans:");
        System.out.println(ans);
        sc.close();

        
    }
    
}
