import java.util.*;

public class countFairPairs2563 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(lower <= nums[i] + nums[j] && nums[i] + nums[j] <= upper) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int upper = sc.nextInt();
        int lower = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
    }
    
}
