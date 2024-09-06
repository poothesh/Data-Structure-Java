package Day4;

import java.util.Scanner;

public class BoundryMatrix {
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        sr.close();
        boundryPrint(matrix);
    }
    
    static void boundryPrint(int arr[][] ) {
    	int n = arr.length;
    	int m = arr[0].length;
    	
    	for(int i=0; i<m; i++) {
    		System.out.print(arr[0][i]+" ");
    	}
    	for(int i=1; i<n; i++) {
    		System.out.print(arr[i][m-1]+" ");
    	}
    	
//    	last row 
    	
    	for(int i = m-2; i>=0; i--) {
    		System.out.print(arr[n-1][i]+" ");
    	}
    	
//    	first col
    	
    	for(int i = n-2; i>=1 ; i--) {
    		System.out.print(arr[i][0]+" ");
    	}	
    }
}

