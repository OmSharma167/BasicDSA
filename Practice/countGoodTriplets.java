import java.util.*;
public class countGoodTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size");
        int n = sc.nextInt();
        System.out.println("Array elemnt");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        System.out.println("c");
        int c = sc.nextInt();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if (Math.abs(arr[i]-arr[j]) <= a && Math.abs(arr[j]-arr[k]) <= b && Math.abs(arr[i]-arr[k]) <= c){
                        count++;
                    }
                    
                }
            }
        }System.out.println(count);
        


    }
    
}
