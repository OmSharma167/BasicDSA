package condtion2;
import java.util.Scanner;

public class greast_three_number_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("enter your second number");
        int num2 = sc.nextInt();
        System.out.println("enter your third number");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("num1 greater than num2 and num3");

        }
        else if(num2>num3 && num2>num1){
            System.out.println("num2 greater than num3 and num1");

        }
        else if(num3>num1 && num3>num2){
            System.out.println("num3 greather than num1 and num2");
        }
        else{
            System.out.println("nothing");
            sc.close();
        }

    }

    
}
