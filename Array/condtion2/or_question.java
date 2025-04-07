package condtion2;
import java.util.Scanner;
// 3 or 5 divisible 

public class or_question {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%5==0 || num%3==0){
            System.out.println("thise is divisible by 3 or 5");
        }
        else{
            System.out.println("thise is not divisible by 3 or 5");
            sc.close();
        }

    }
    
}
