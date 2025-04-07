import java.util.*;

public class Pranthesis {
    public static String OuterMostPranthesisRemove(String s ){
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'){
                count--;
            }
            if(count != 0){
                ans.append(ch);
            }
            if(ch=='('){
                count++;
            }

        }return ans.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(OuterMostPranthesisRemove(s));


    }
    
}
