
import java.util.Scanner;


public class find_the_sum_of_given_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit_of_sum=0;
       
        // some of given number of digit
        //(any_number%10)=last digit of number
        while(n>0){
            digit_of_sum += n%10;
            n = n/10;

        }
        System.out.println(digit_of_sum);
        sc.close();

        
    }
    
}
