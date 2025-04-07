//package Array_lec_14;
//import java.util.Scanner;

class ArraysExample{
    void demoArrays(){
        int[] ages = new int[5];
        //float[] weight = new float[3];
       // String[] names = new String[5];

        ages[0]=34;
        ages[1]=23;
        ages[2]=41;
        ages[3]=35;
        ages[4]=45;
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        
        // or 


        //  for loop 
        for(int i = 0; i<5; i++){
            System.out.println(ages[i]);
        }   


            // for each loop


        for(int age: ages){
            System.out.println(age);

        }

        // while loop

        int i = 0;
        while(i<5){
            System.out.println(ages[i]);
            i++;
        }

    }

}

public class Array1 {
    public static void main(String[] args) {
        ArraysExample obl =new ArraysExample();
        obl.demoArrays();

    }
    
}
