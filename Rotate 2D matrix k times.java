import java.util.Scanner;

public class Main {

    // Function to rotate the matrix by 90 degrees
    private void rotate90Degrees(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // Function to rotate the matrix k times
    public void rotate(int[][] matrix, int k) {
        int times = k % 4; // Since rotating by 360 degrees is the same as no rotation
        for (int i = 0; i < times; i++) {
            rotate90Degrees(matrix);
        }
    }

    // Function to print the matrix
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions
        System.out.print("Enter the number of rows (N): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns (M): ");
        int m = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[n][m];

        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Read number of rotations
        System.out.print("Enter the number of rotations (k): ");
        int k = sc.nextInt();

        // Validate if the matrix is square
        if (n != m) {
            System.out.println("Rotation is only supported for square matrices.");
            return;
        }

        Main solution = new Main();

        System.out.println("Original matrix:");
        solution.printMatrix(matrix);

        // Perform rotations
        solution.rotate(matrix, k);

        System.out.println("Matrix after " + k * 90 + " degrees rotation:");
        solution.printMatrix(matrix);

        sc.close(); // Close the scanner
    }
}
