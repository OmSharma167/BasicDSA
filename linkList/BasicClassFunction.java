//package linkList;

public class BasicClassFunction {
    public static void dispaly(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
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

        
    }
    
}
