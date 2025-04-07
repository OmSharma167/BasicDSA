package Queue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BAsicSTLL {
    public static void main(String[] args) {
        ArrayList<Integer>  ans= new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q= new LinkedList<>(); 
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());// element
        System.out.println(q.size());


            
        
    }

    
}
