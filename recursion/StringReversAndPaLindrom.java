import java.util.Scanner;
public class StringReversAndPaLindrom {
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";

        }
        String smallAns = reverse(s, idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // reverse of string
        //System.out.println(reverse(s,0));
        // palindrom
        String rev = reverse(s, 0);
        if(rev.equals(s)){
            System.out.println( "palindrom");
        }else{
            System.out.println(" not palindrom");
        }sc.close();

    }
    
}
