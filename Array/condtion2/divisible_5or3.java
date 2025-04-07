package condtion2;
import java.util.Scanner;
// using nested
public class divisible_5or3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        if(num%5==0){
            if(num%3==0){
                System.out.println("this is divisible by 5 and 3 both");
            }
            else{
                System.out.println("thie is not divisible by 3");
            }
        }
        else{
            System.out.println("this is not divisible by 5 and 3");
        }
        sc.close();
    }
    
}
