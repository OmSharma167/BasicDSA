//package linkList;

public class Insert {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static class linklist{
        Node head = null;
        Node tail = null;
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
        void inserAt(int idx,int val){
           
            Node t = new Node(val);
            Node temp = head;
             if(idx==size()){
                insertAtEnd(val);
                return;

            }
            else if(idx==0){
                insertHead(val);
                return;
                
            }
            else if(idx<0){
                System.out.println("wrong index ");
                return;
            }
            else if (idx>size()){
                System.out.println("wrong");
                return;
            }
            for(int i = 0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        void dispaly(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                
                temp  = temp.next;
                
            }
        
        }
    
        void insertHead(int val ){
       
            Node temp = new Node(val);
            if(head==null){// empty list
                head = temp;
                tail = temp;

            }
            else{// non empty
                temp.next = head;
                head = temp;


            }
        }
    }
    public static void main(String[] args) {
        linklist ll= new linklist();
        ll.insertAtEnd(4);
        //ll.dispaly();
        ll.insertAtEnd(5);
        //ll.dispaly();
        ll.insertAtEnd(12);
        //ll.dispaly();
        ll.insertHead(13);
        ll.dispaly();
        System.out.println();
        ll.inserAt(4, 10);
        // agar index item ke brabar ho jayega to 
        ll.dispaly();
        System.out.println();
        // may error when index data 2.16h
        System.out.println(ll.tail.data);
        //System.out.println();
        // output 100,13,4,5,12,10 aana chahiye but here 
        // 13,100,4,5,12,10 aa rha h
        ll.inserAt(0, 100);
    
        System.out.println();
        ll.dispaly();

        
    }
    
}
