package stack;
import java.util.*;
public class DisplayStackUsingRecursion {
    // reverse display
    public static void displayrec(Stack<Integer> st){
       if(st.size()==0) return;
       int top = st.pop();
       System.out.println(top+" ");
       displayrec(st);
       st.push(top);

    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        System.out.println(st);
        displayrec(st);
        //System.out.println(st);

    }
    
}
