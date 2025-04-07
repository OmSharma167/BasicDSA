import java.util.Scanner;
public class Multiple {
    static void printMultiple(int n,int k){
        // base class 
        if(k==1){
            System.out.println(n);
            return;
        }
        // recursive work
        printMultiple(n, k-1);// 5,10,15
        // self work
        System.out.println(n*k);
    } 

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiple(n, k);
        sc.close();


    }
        
    
}
