import java.util.Scanner;
public class Target3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arry size:");
        int ans = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter arr");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();     
        }
        System.out.println("arr is");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("target");
        int tar = sc.nextInt();
        for(int i = 0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==tar){
                        ans++;
                        
                    }
                }
            }
        }
        System.out.println(ans);

        
    }
    
}
