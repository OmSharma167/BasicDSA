public class BasicLL {
    public static class Node{
        int data;// value
        Node next;// next node of address
        Node(int data){
            this.data = data;
            
        }


    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a  = new Node(5);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        // System.out.println(a.next.next.data);
        display(a);
        
        // Node temp = a;
        // while(temp != null){
        //     System.out.println(temp.data);
        //     temp = temp.next;

        // }

        
    }
    
}
