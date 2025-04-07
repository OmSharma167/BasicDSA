// package Practice;

import java.util.Scanner;

public class maximumTripletValue {
    
    public static int max(int[] arr, int n) {
        // using preprocessing
        int[] left = new int[n];
        int[] right = new int[n];

        //left
        left[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
           left[i]= Math.max(left[i-1],arr[i]);
        }
        // right
        right[n-1] = arr[n-1];
        for(int i = n-2;i>0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        // ans
        int ans = 0;
        for(int i=1;i<n-1;i++){
            ans = Math.max(ans,(left[i-1] - arr[i]) * right[i+1]);
        }return ans;

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int arr[] = new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int n = arr.length;
        int maxValue = max(arr, n);
        System.out.println("The maximum triplet value is: " + maxValue);
        sc.close();


        
       
       
        
    }
    
}
