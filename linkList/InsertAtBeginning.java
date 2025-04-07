//package linkList;

//import linkList.ImpInsertAtEnd.linklist;

public class InsertAtBeginning {
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
        void dispaly(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
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
        ll.dispaly();ll.insertHead(13);
        ll.dispaly();
        
    }
    
}
