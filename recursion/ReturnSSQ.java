import java.util.*;
public class ReturnSSQ {
    
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans =  new ArrayList<>();
        // base case 
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curre = s.charAt(0); //a
        ArrayList<String> smallAns= getSSQ(s.substring(1));//["bc","b","c",""]

        // ans = ["bc","abc","b","ab","ab",c"ac","",a"]
        for(String ss:smallAns){
            ans.add(ss);// bc
            ans.add(curre+ss);//abc
        }
        return ans;

    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String ss:ans){
            System.out.println(ss);
        }
        
    }
}
