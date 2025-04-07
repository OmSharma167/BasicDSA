package BasicMath;

public class count {
    public static void main(String[] args) {
        int n = 123445;
        int coun = 0;
        while (n>0) {
            int lastdigit = n%10;
            coun++;
            System.out.print(lastdigit);
            n= n/10;    
        }
        System.out.println(coun);
    }
    
}
