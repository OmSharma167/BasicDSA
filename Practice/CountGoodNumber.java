import java.util.*;
public class CountGoodNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int gooddigit = 1;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                gooddigit*=5;
            }
            else{
                gooddigit*=4;
            }
        }System.out.println(gooddigit);
        sc.close();

    }
    
}
