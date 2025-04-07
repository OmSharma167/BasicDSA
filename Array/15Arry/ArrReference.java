//package Arry_lec15;
import java.util.Scanner;
public class ArrReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arr size");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your arr is");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // trying to copy arr_2 
        System.out.println(" copy arr");
        int[] arr_2 = arr;
        for(int i = 0; i<arr_2.length;i++){
            System.out.println(arr_2[i]);
        }

        // changing some value
        System.out.println("Original arry after changing arr_2");
        for(int i = 0; i<arr_2.length;i++){
            arr_2[0] = 0;
            arr_2[1]= 0;
            System.out.println(arr_2[i]);
        }
        // lec 15 in full  concept
        // clone
        System.out.println("copied arr_2 after changing arr_2");
        for(int i = 0; i<arr_2.length;i++){
            arr_2[0] = 5;
            arr_2[1]= 3;
        
            System.out.println(arr_2[i]);
            sc.close();
        }





    }
    
}
