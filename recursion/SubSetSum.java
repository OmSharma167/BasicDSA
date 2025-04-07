public class SubSetSum {
    static void subSetSum(int[] a, int  n ,int idx, int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }

        // cur idx + sum
        subSetSum(a, n, idx+1, sum+a[idx]);// inculude 

        // cur ans
        subSetSum(a, n, idx+1, sum);// exclude
    }
    public static void main(String[] args) {
        int[] a = {2,4,5};
        subSetSum(a, a.length, 0, 0);
        
    }
    
}
