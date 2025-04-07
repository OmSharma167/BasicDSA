package Arry_lec15;
import java.util.Scanner;

public class TakingInputArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size");
        int n = sc.nextInt();

        int[] arry = new int[n]; 
        System.out.println("Enter: "+n +" elements");
        for(int i = 0; i<arry.length; i++){
            arry[i]=sc.nextInt();
        }

        for(int i = 0; i<arry.length; i++){
            System.out.print(arry[i]+ " ");
            sc.close();;
        }
        
        
    }
    
}
