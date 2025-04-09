package LL;
import java.util.*;
public class ArrayToll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node Arrytolinklist(int[] arr,int n){
        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1;i<n;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;


        }return head;
    }
    public static void Display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       Node ans =  Arrytolinklist(arr,n);
        Display(ans);
        sc.close();    
    }
    
}
