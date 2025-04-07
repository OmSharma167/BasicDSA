//package linkList;

public class EvidentLimition {
    public static void inserAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }
    // list node
    public static class Node{
        int data;// value
        Node next;// address of next node
        Node(int data){
            this.data = data;
        }
    }   
    public static void dispaly(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp  = temp.next;
                
            
        
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
        inserAtEnd(a, 76);
        dispaly(a);
    }
    
}
