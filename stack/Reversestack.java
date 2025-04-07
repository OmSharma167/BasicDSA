package stack;
import java.util.Stack;
public class Reversestack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> t = new Stack<>();
        while(gt.size()>0){
            t.push(gt.pop());
        }
        System.out.println(t);
        while(t.size()>0){
            st.push(t.pop());
        }
        System.out.println(st);




                

    }
    
}
