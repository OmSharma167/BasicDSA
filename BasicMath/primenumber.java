package BasicMath;

public class primenumber {
    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
}
