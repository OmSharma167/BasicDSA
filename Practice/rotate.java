import java.util.*;

public class rotate {
    public static  void rotatearray(int[] nums,int k,int n){
    k=k%n;
    //pura array ko reverse kerr do
    rotatarray(nums,0,n-1);
    // o to k tk reverse ker do
    rotatarray(nums,0,k-1);
    // ab bchha hua ko reverse ker do
    rotatarray(nums,k,n-1);

    }
    public static void rotatarray(int[] nums,int first,int last){
        while(first<last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array element");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter rotate array size ");
        int k = sc.nextInt();
        rotatearray(nums, k, n);

        for(int i = 0;i<n;i++){
            System.out.println(nums[i]);
        }

        sc.close();
        
    }
    
}
