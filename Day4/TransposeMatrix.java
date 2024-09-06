package Day4;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        sr.close();
        Transpose(matrix);
	}

	private static void Transpose(int[][] matrix) {
		// TODO Auto-generated method stub
		int n = matrix.length;
		int m = matrix[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				if(i==j) {
					System.out.print(matrix[i][j]+" ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
