//package Arry_lec15;
import java.util.Scanner;
public class Arr_sortedOrNot {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your arr size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter your arry");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //System.out.println("your value is sorted or not");
        boolean cheak = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                // not sorted
                cheak = false;
                break;
            
            }sc.close(); 
        }
        System.out.println("Your boolean tru or false ");
        System.out.println(cheak);

    }
    
}
