package condtion2;
import java.util.Scanner;

public class divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("this is divisible by 5");
        }
        // else;
        // System.out.println("Thise is not divisble by 5");
        sc.close();
    }



    
}
