import java.util.*;


public class countPairs2176 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("k ");
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Arry size");
        int arr[] = new int[n];
        System.out.println("ArrayElement");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//         Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 

// Example 1:

// Input: nums = [3,1,2,2,2,1,3], k = 2
// Output: 4
int count = 0;
for(int i = 0;i<n;i++){
    for(int j = i+1;j<n;j++){
        if(arr[i]==arr[j]){
            int mul = i*j;
            if(mul%k==0){
                count++;
            }
        }
    }
}System.out.println(count);
    
    }
    
}
