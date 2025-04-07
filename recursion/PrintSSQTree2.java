public class PrintSSQTree2 {

    static void printSSq(String s, String currAns){// s = "abc",currAns=""
       
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSq(remString, currAns+curr);// add cur
        printSSq(remString, currAns);// do not add curr



        

    }
    public static void main(String[] args) {
        printSSq("abc", "");
        
    }
    
}
