//import java.util.*;
public class StrRemoveCracter {
    public static void main(String[] args) {
        String s= "abcdef";
        String ans = " ";
        for(char i = 0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                ans+=s.charAt(i);
                //System.out.println(ans);
            }
        System.out.println(ans);   
        }
        
    }
    
}
