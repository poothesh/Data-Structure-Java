package Day3;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int N = sc.nextInt();
		int arr[] = new int[N]; 
		
		System.out.print("Enter Array Values: ");
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			 
		}
		sc.close();
		
		System.out.print("Reversed Array: ");
		for(int j=N-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
	}

}
