public class nthNodeFrromEnd {
    private Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        // mth node from start
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        nthNodeFrromEnd obj = new nthNodeFrromEnd();
        Node a = obj.new Node(100);
        Node b = obj.new Node(13);
        Node c = obj.new Node(4);
        Node d = obj.new Node(12);
        Node e = obj.new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node q = obj.nthNode(a, 4);
        System.out.println(q.data);
    }
}
