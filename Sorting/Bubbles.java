package Sorting;

public class Bubbles {
    static void bubblesort(int[] a){
        int n = a.length;
        //n-1 itertion passes
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                // last i element are alredy at correct sorted postion
                // so need to cheak them
                if(a[j]>a[j+1]){
                    // swap 
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;

                }


            }
            

        }
    }
    public static void main(String[] args) {
        int[] a = {5,6,7,9,2,5,4};
        bubblesort(a);
        for(int i:a){
            System.out.println(i);
        }
        
    }
    
    
    
}
