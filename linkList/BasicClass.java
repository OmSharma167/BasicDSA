//package linkList;
public class BasicClass {
    // list node
    public static class Node{
        int data;// value
        Node next;// address of next node
        Node(int data){
            this.data = data;
        }
    }   
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b; // 5,3
        b.next = c; // 5,3,9
        c.next = d;// 5,3,9,8
        d.next = e;//5,3,9,8,16
        
        // // firstrule 
        // System.out.println("first rule");
        //System.out.println(a);
        //System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);

        // // seccond rule
        // System.out.println("second rule");
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // inserAtEnd(a, 76);
        // dispaly(a);
        Node temp = a;
        // // for loop
        // // same code while loop and thise is best
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        
    }
    
}
