package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Queue<Integer> help= new LinkedList<>();
        while(q.size()>0){
            System.out.println(q.peek()+" ");
            help.add(q.remove());
        }
        while(help.size()>0){
            q.add(help.poll());
        }  
    }
    
}
