
import java.util.Scanner;

public class Find_a_raise_to_the_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=b; i++){
            ans = ans*a;
            sc.close();
        }
        System.out.println(ans);

    }
    //lecture 8 coverd 
    // Number of digit
    // Sum of digit
    // Reverese of digit
    // Sum of SEries 
    // Factorial
    
    
}
