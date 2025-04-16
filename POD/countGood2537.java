import java.util.*;

public class countGood2537 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int ans  = 0;
        for(int i = 0;i<nums.length;i++){
            HashMap<Integer,Integer> frqncy  =new HashMap<>();
            int pairs = 0;
            for(int j = i;j<nums.length;j++){
                int count  = frqncy.getOrDefault(nums[j],0);
                pairs +=count;
                frqncy.put(nums[j],count+1);
                if(pairs>=k){
                    ans++;
                }
            }
                
        }System.out.println(ans);

    }
    
}
