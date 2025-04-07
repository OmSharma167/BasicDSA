import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.substring(2, 6));
        char ch = s.charAt(0); // find indexing
        System.out.println(ch);
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i));
            sc.close();
        }
    }
    
}
