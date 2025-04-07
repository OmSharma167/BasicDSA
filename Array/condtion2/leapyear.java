package condtion2;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int num = sc.nextInt();
        if(num%400==0){
            System.out.println("leap");
            sc.close();
        }
    }
    
}
