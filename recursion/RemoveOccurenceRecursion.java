import java.util.Scanner;
public class RemoveOccurenceRecursion {
    // dbacx
    // (2) abxc
    static String removeA(String s,int idx){
        // base case 
        if(idx==s.length()){
            return " ";
        }

        // recursive work
        String smallAns = removeA(s, idx+1);// bcx /// bcx
        char currChar = s.charAt(idx);

        // self work
        if(currChar !='a'){
            return currChar+smallAns; // d+bcx
        }else{
            return smallAns;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
        sc.close();
        
          
    }
    
}
