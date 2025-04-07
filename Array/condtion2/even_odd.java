package condtion2;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // if(condtion){
            // code
        //}
        if(n%2==0){
            System.out.println("the number is even:");

        }
        // or else bhi use kr skte hai
        if(n%2!=0){
            System.out.println("this is odd number");
            sc.close();
        }

    }

    
}
