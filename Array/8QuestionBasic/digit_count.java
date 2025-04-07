
import java.util.Scanner;
public class digit_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_degit=0;
        while(n>0){
            n = n/10;
            number_of_degit++;
            sc.close();

        }
        System.out.println(number_of_degit);
    }
    
}
