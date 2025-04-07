public class Str_1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2  = "Hello";
        String s3  = new String("World");
        String s4 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.charAt(4));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.concat(s4));
        System.out.println(s1.equals(s2));

        

    }
    
}
