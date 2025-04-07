package condtion2;
import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
          // percentage
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    if(num>=90){
        System.out.println("Excellent");
    }
    else if(num>=80){
        System.out.println("very good");
    }
    else if(num>=70){
        System.out.println("good");
    }
    else if(num>=60){
        System.out.println(" you can better");
        sc.close();

    }

        
    }

    
}
