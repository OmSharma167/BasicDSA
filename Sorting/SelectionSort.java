package Sorting;
//import java.util.*;
public class SelectionSort {
    static void selectionsert(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min_index = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
        
    }
    public static void main(String[] args) {
        int[] arr = {3,56,8,7,1,9};
        selectionsert(arr);        
    }
    
}
