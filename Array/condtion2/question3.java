package condtion2;
import java.util.Scanner;

// find 5 and 3 by divisiable

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("this is divisible by 3 and 5");

        }
        else{
            System.out.println("not divisble ");
            sc.close();
        }

        
    }


    
}
