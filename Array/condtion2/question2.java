package condtion2;
import java.util.Scanner;
// three digit or not 

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(90<num && num<1000){
            System.out.println("thise is three digit number ");
        }
        else{
            System.out.println("thise is not three digit");
            sc.close();
        }

    }
    
}
