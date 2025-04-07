//package linkList;

public class ImpInsertAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static class linklist{
        Node head;
        Node tail;
        void insertAtEnd(int val){
            // new node
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next  = temp;
                tail = temp;

            }

        
            
        }
        void dispaly(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp  = temp.next;
                
            }
        
        }
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while(temp!=null){
        //         count++;
        //         temp = temp.next;
        //     }
        //     System.out.println("counting ");
        //     return count;
        // }
        


    }
    public static void main(String[] args) {
        linklist ll= new linklist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        
        ll.dispaly();

        //System.out.println(ll.size());
    }
    
}
