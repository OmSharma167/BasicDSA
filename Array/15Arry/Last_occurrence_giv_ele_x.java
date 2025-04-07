//package Arry_lec15;
import java.util.Scanner;
public class Last_occurrence_giv_ele_x {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your arr size");
        int n = sc.nextInt();
        int[] aar = new int[n];
        System.out.println("Enter arr");

        for(int i = 0; i<aar.length;i++){
            aar[i] = sc.nextInt();

        }
        System.out.println("enter your x or cheak value");
        int x = sc.nextInt();
        int lastIndex = -1;// 0
        for(int i = 0; i<aar.length;i++){
            if(aar[i]==x){
                lastIndex = i;
            sc.close();

            }
        }
        System.out.println("Last occurrence: ");
        System.out.println(lastIndex);



        
    }
    
}
