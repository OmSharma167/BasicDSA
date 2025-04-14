package LogicBuildingAllQuestion;
import java.util.*;

public class maxProfitAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("difficulty size");
        int diff = sc.nextInt();
        int[] difficulty = new int[diff];
        System.out.println(" Difficulty element");
        for(int i = 0;i<diff;i++){
            difficulty[i] = sc.nextInt();
        }
        System.out.println(" Profite size");
        int pro = sc.nextInt();
        int[] profit = new int[pro];
        System.out.println("profit element");
        for(int i =0;i<pro;i++){
            profit[i] = sc.nextInt();
        }
        System.out.println("Worker size");
        int wrk = sc.nextInt();
        int[] worker = new int[wrk];
        System.out.println("worker elemnt");
        for(int i = 0;i<wrk;i++){
            worker[i] = sc.nextInt();
        }


        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<worker.length;i++){
            int maxpro = 0;
            for(int j =0;j<difficulty.length;j++){
                if(worker[i]>=difficulty[j]){
                    maxpro = Math.max(maxpro, profit[j]);
                }
            }list.add(maxpro);
        }
        int sum = 0;
        for(int i = 0;i<list.size();i++){
            int gett = list.get(i);
            sum+=gett;
        }
        System.out.println(sum);




    }
    
}
