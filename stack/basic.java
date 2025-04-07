package stack;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        System.out.println(st);
        System.out.println(st.peek());
        //System.out.println(st.pop());
        //System.out.println(st.pop());
        System.out.println("size of");
        System.out.println(st.size());
        // first or any number 
        while(st.size()>3){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        

    
    }
    
}
