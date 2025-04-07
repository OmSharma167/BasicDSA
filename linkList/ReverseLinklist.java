//package linkList;

public class ReverseLinklist {
    public static void displayre(Node head){
        if(head==null) return;
       // System.out.println(head.data);
        displayre(head.next);
        // reverse
        System.out.print(head.data+" ");

    }
    // normal
    public static void dispaly(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        dispaly(a);
        System.out.println();
        displayre(a);
    }
        
    
    
}
