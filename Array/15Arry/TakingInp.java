package Arry_lec15;
import java.util.Scanner;
public class TakingInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
          

        }
        System.out.println("your arr is");
        for(int i =0; i<arr.length;i++ ){
            System.out.println(arr[i]);
            sc.close();

        }

    }
    
}
