package Day4;

import java.util.Scanner;

public class MatrixTraversalInAlternateManner {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int row = sr.nextInt();
        int col = sr.nextInt();
        int[][] matrix = new int[row][col];

        // Input matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sr.nextInt();
            }
        }
        sr.close();
        // Traverse the matrix in alternate manner
        boolean leftToRight = true;
        for (int i = 0; i < row; i++) {
            if (leftToRight) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            leftToRight = !leftToRight;
            System.out.println();
        }
    }
}

