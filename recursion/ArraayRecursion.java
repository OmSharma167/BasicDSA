public class ArraayRecursion {
    static void printArray(int[] arr, int idx){
        // base class
        if(idx==arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);//5
        // recursive problem
        printArray(arr, idx+1);// 678
    }
    
    public static void main(String[] args) {
        int[] arr  = {5,6,7,8};
        printArray(arr, 0); 

        
    }
    
}
