public class emptyArea {
    public int emptyAreacall(int[] height) {
        int totalArea = 0;
        int pillarsArea = 0;
        int maxHeight = 0;

        // Calculate the total area 
        for (int h : height) {
            maxHeight = Math.max(maxHeight, h);
            totalArea += h;
        }

        // Calculate the area occupied by ....
        for (int h : height) {
            pillarsArea += (maxHeight - h);
        }

        return totalArea - pillarsArea;
    }

    public static void main(String[] args) {
        emptyArea solution = new emptyArea();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int emptyArea = solution.emptyAreacall(height);
        System.out.println("Empty area between pillars: " + emptyArea);
    }
    
}
