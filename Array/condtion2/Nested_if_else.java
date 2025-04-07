package condtion2;
import java.util.Scanner;
// divisible by 3 and 5 both nested condtion
public class Nested_if_else {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n%5==0){
            if(n%3==0){
                System.out.println("the number is divisible by 3 and 5 both");
            }
            else{
                System.out.println(" not divisible by inner condtion");
            }
        }
        else{
            System.out.println("not divisible");
            sc.close();
        }
        

    }
   
   
}
