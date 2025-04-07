package condtion2;
import java.util.Scanner;
public class nested3or5vutnot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("divided bh 3 or 5 five but not 15");
            }
            else{
                System.out.println("not match the required condtion");
            }

        }
        else{
            System.out.println("not match the requred condtion");
            sc.close();
        }
    }
    
}
