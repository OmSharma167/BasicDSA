public class GoodTrgetSerchArray {
    static boolean search(int[] arr,int n,int target, int idx){
        // base case 
        if(idx>= n){
            return false;

        }

        //self case 
        if(arr[idx]>=target){
           return true;

        }
        

        // recursive work
        // if(search(arr,n,target,idx+1)){
        //     return true;

        // }
        // else{
        //     return false;
        // }
        return search(arr,n,target,idx+1);





    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int target = 4;
        int n = arr.length;
        if(search(arr,n,target,0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
    
}
