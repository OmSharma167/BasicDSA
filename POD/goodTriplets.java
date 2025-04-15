import java.util.*;

public class goodTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First arra size");
        int n1 = sc.nextInt();
        System.out.println("num1 elemnt");
        int[] nums1 = new int[n1];
        for(int i = 0;i<n1;i++){
            nums1[i]= sc.nextInt();
        }
        System.out.println("num2 size");
        int n2 = sc.nextInt();
        System.out.println("nums2 elements");
        int[] nums2 = new int[n2];
        for(int i = 0;i<n2;i++){
            nums2[i] = sc.nextInt();
        }

        // make a hashmap
        HashMap<Integer,Integer> pos1 = new HashMap<>();
        HashMap<Integer,Integer> pos2 = new HashMap<>();

        for(int i =0;i<n1;i++){
            pos1.put(nums1[i],i);
            pos2.put(nums2[1],i);
        }
        int count = 0;

        for(int i = 0;i<n1;i++){
            for(int j = i+1;j<n1;j++){
                for(int k = j+1;k<n1;k++){
                    int x = nums1[i];
                    int y= nums1[j];
                    int z = nums1[k];

                    if(pos2.get(x) < pos2.get(y) && pos2.get(y)< pos2.get(z)){
                        count++;

                    }
                }
            }
        }System.out.println(count);

    }
    
}
