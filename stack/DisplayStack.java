package stack;
import java.util.*;
public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     int x = st.pop();
        //     rt.push(x);
        //     //or direct rt.push(st.pop());
        // }
        //  while(rt.size()>0){
        //     int x = rt.pop();
        //     System.out.println(x);
        //     st.push(x);
        // }
        // same array
        int  n = st.size();
        int[] arr =new int[n];
        for(int i =n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
            st.push(arr[i]);
        }
    }
    
}
