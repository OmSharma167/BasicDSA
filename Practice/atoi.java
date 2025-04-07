import java.util.*;
public class atoi {
    public static ArrayList<Integer> strtoint(String n){
        // int result = 1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<n.length();i++){
            char ch = n.charAt(i);
            int r = ch-'0';
            result.add(r);


        }return result;


    }
    public static int strint(String n){
        int result = 0;
       
        for(int i = 0;i<n.length();i++){
            char ch = n.charAt(i);
            int r = ch-'0';
           while(r>=1 && r<=9){
             result = result*10+r;
             break;
           }

        }return result;


    }
    public static void main(String[] args) {
        // string to integer
        Scanner sc= new Scanner(System.in);
        String n = sc.next();
        System.out.println(strtoint(n));
        System.out.println(strint(n));
        sc.close();

        
    }
    
}
