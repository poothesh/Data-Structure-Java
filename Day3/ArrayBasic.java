package Day3;

import java.util.*;

public class ArrayBasic {

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
		for(int i = 0; i <= arr.length-1 ; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
	}

}
