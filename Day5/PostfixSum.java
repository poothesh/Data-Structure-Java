package Day5;

import java.util.Scanner;

public class PostfixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int n = sc.nextInt(); 
		int[] arr = new int[n];
		
		for (int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.print("Postfix Sum: ");
		int sum = 0 ;
		for(int i=n-1;i>=0;i--) {
			sum = sum+arr[i];
			System.out.print(sum+" ");
		}
	}

}
