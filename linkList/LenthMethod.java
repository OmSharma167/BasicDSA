//package linkList;

public class LenthMethod {
    // public static void dispaly(Node head){
    //     while(head!=null){
    //         System.out.println(head.data+" ");
    //         head = head.next;
    //     }
    // }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;

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
        //dispaly(a);
        System.out.println("length of");
        System.out.println(length(a));

        
    }
    
}
