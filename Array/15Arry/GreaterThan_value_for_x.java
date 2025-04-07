//package Arry_lec15;
import java.util.Scanner;
public class GreaterThan_value_for_x {
    // count greater than value for x
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arr size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter your arr");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter your x value");
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<x){
                count++;

            }

        sc.close();
        }
        System.out.println("Count value is: ");
        System.out.println(count);
        

    }
    
}
