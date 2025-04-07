
public class ArrayMaxValueRecursion {
    static int maxArray(int[] arr , int idx){
        // base case
        if(idx==arr.length-1){
            return arr[idx];
        }
        // small problem -> idx+1
        int smallAns = maxArray(arr, idx+1);
        // self work final ans
        return  Math.max(arr[idx],smallAns);
    
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        //maxArray(arr, 0);
        System.out.println(maxArray(arr, 0));

        
    }
    
}
