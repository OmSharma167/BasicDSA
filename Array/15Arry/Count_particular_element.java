//package Arry_lec15;
import java.util.Scanner;
public class Count_particular_element {
    // count same number 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arr size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your number");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your arr");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter your x value ");
        // for chaeking 
        int x = sc.nextInt();
        int count = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
                sc.close();

            }

        }
        System.out.println("count value is: " + count);
    }
}
