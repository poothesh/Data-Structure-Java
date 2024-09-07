package Day5;

import java.util.*;


public class TransposeFullMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int [][]mat = new int[n][m];
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
       rotateMatrixBy90(mat, n, m);
        
       
    }

	private static void rotateMatrixBy90(int[][] mat, int n, int m) {
		// TODO Auto-generated method stub
        int[][] t = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                t[i][j] = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                t[i][j] = mat[i][j];
                mat[i][j] = mat[i][m-1-j];
                mat[i][m-1-j] = t[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	}
}