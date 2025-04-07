class Arry{
    void ArrEx(){
        int arry[] = {1,5,3};

        int ans = 0;
        for(int i = 0; i<arry.length; i++){
            if(arry[i]>=ans){
                ans = arry[i];

            }
        }
        System.out.println("Max: " +ans);
    }
    // second question arr[] = {1,5,3},x = 5;

    void ArryEx2(){
        int ar[] = {1,5,3};
        int x = 3;
        int ans = -1;//0//1
        for(int i = 0; i<ar.length; i++){
            if(ar[i]==x){
                ans = i;  

            }
                

           
        }
       System.out.println("Found "+x+ " at index " + ans);
    
    }


    void ArrayEx3(){
        int ar[] = {12,32,11,10,97};
        int ans  = 0;
        for(int i = 0; i<ar.length; i++){
            if(ar[i]>=ans);
            ans = ar[i];
        }
        System.out.println("This is max value");
        System.out.println(ans);
    }

    
}



public class MaxValue {
    public static void main(String[] args) {
        Arry obj  = new Arry();
        obj.ArrEx();
        obj.ArryEx2();
        obj.ArrayEx3();
    }

    
}
