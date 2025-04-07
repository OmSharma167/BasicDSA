package condtion2;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        // absolute value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        // take integer value and gives absolute value
        if(num<=0){
            num = num*(-1);
            System.out.println("the number is absolute : "+num);
            sc.close();

        }

    }
    
}
