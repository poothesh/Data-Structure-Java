package Day5;

import java.util.Scanner;

public class PrefixProduct {

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
		
		System.out.print("Prefix product: ");
		int product = 0;
		for(int i=0;i<n;i++) {
			product = product * arr[i];
			System.out.println(product+" ");
		}
	}

}
