public class TargetSerchIndexREturn {
    // return index of element if target present in  array other wise -1
    static int findIndex(int[] a,int n, int target, int idx){
        // find first index 4,4,4,4,4
        // base case 
        if(idx>=n){
            return -1;
        }
        // self work
        if(a[idx]==target){
            return idx;

        }
        // recursive work
        return findIndex(a,n, target, idx+1);

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,4,5,4};
        int target = 4;
        int n = a.length;
        System.out.println(findIndex(a, n, target, 0));
        
        
    }
    
}
