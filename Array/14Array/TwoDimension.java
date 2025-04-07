import java.util.Scanner;
public class TwoDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array content:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}


