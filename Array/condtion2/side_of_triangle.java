package condtion2;
import java.util.Scanner;
// a+b>c
// b+c>a
//c+a>b
// take 3 number input and  tell if they can be the sides of triangle.


public class side_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first side :");
        int n1 = sc.nextInt();
        System.out.print("enter your second side :");
        int n2 = sc.nextInt();
        System.out.println("enter your third side :");
        int n3 = sc.nextInt();
        if(n1+n2>n3 && n2+n3>n1 && n3+n1>n2){
            System.out.println("valid tringle");

        }
        else{
            System.out.println("invalid tringle");
            sc.close();
        }
        
    }
    
}
