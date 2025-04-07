import java.util.*;

class xorsumtab{
    public static int xorsumtables(int[] arr,int n){
            int OR = 0;
            for(int i = 0;i<n;i++){
                OR |= arr[i]; 
            }
            return OR * (int)Math.pow(2,n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(xorsumtables(arr,n));
        sc.close();

    }
}