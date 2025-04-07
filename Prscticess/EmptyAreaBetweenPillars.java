public class EmptyAreaBetweenPillars {
    public int emptyArea(int[] height) {
        int totalArea = 0;
        int pillarsArea = 0;
        int maxHeight = 0;

        // Calculate the total area enclosed by the pillars
        for (int h : height) {
            maxHeight = Math.max(maxHeight, h);
            totalArea += h;
        }

        // Calculate the area occupied by the pillars themselves
        for (int h : height) {
            pillarsArea += (maxHeight - h);
        }

        // The empty area is the difference between the total area and the pillars' area
        return totalArea - pillarsArea;
    }

    public static void main(String[] args) {
        EmptyAreaBetweenPillars solution = new EmptyAreaBetweenPillars();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int emptyArea = solution.emptyArea(height);
        System.out.println("Empty area between pillars: " + emptyArea);
    }
}
