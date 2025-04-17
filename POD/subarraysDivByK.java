import java.util.*;

// 974. Subarray Sums Divisible by K

class subarraysDivByK {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();

    }
    int k = sc.nextInt();

    int count = 0;
        for(int i = 0;i<arr.length;i++){
            int idxsum = 0;
            for(int j = i;j<arr.length;j++){
                idxsum += arr[j];
                if(idxsum%k==0){
                    count++;
                }
            }
        }System.out.println(count);
        





    }
    
}
