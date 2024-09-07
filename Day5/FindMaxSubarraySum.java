package Day5;

import java.util.Scanner;

public class FindMaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int n = sc.nextInt(); 
		int[] arr = new int[n];
		System.out.println("Enter Array Elements");
		for (int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum = sum+arr[k];
				}
				System.out.println();

				if(sum > max) {
					max = sum;
				}
			}
			
		}
		System.out.println("The max sum of the sub array is: "+max);
	}

}
