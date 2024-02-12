import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; // Declaring a 3x3 matrix
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }

        // Output
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
