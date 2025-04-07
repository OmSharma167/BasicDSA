public class SumOfArrayRecursion {
    static int sumOfArray(int[] arr , int idx){
        // base case 
        if(idx==arr.length){// arr ke bahar pahuch gye yeha per
            return 0;
        }

        // recursive work
        int smallAns  = sumOfArray(arr, idx+1);
        //self work
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumOfArray(arr, 0));
        
    }
    
}
