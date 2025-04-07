package stack;
import java.util.*;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number element you want to insert: ");
        n = sc.nextInt();
        System.out.println("Enter the element: ");
        for(int  i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        // reverse order
        Stack<Integer> t = new Stack<>();
        System.out.println(st);
        while(st.size()>0){
           
            int x = st.peek();
            t.push(x);
            st.pop();
        }
        System.out.println(t);
        Stack<Integer> o = new Stack<>();
        while(t.size()>0){
           
            int x = t.peek();
            o.push(x);
            t.pop();
        }
        System.out.println(o);
        sc.close();
        
    }
    
}
