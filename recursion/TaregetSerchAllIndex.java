import java.util.ArrayList;

public class TaregetSerchAllIndex {
    static ArrayList<Integer> findAllIndex(int[] a, int n, int target, int idx){// 1,2,3,2,2,5
        ArrayList<Integer> ans = new ArrayList<>();
        // base class
        if(idx>=n){
            return ans;// return empty arrlist

        }
        // self work
        if(a[idx]==target){
            //System.out.println(idx);
            ans.add(idx);
        }
        // recursive work
        //findAllIndex(a, n, target, idx+1);// 1,3,4
        ArrayList<Integer> smallAns=findAllIndex(a, n, target, idx+1);
        ans.addAll(smallAns);
        return ans;

    }
    public static void main(String[] args) {
       
        int[] a = {1,2,3,2,2,5};
        int n = a.length;
        int target = 2;
        ArrayList<Integer> ans = findAllIndex(a,n,target,0);
        for(Integer i: ans){
            System.out.println(i);

        }

        
        
    }
    
}
