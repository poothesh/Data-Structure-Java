package Day3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key Element to find in Array; ");
		int key = sc.nextInt();
		
		System.out.print("Enter Size of Array: ");
		int N = sc.nextInt();
		
		int arr[] = new int[N]; 
		System.out.print("Enter Array Values: ");
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		linearSearch(arr,key);
	}

	private static void linearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		boolean found = false;
		for (int i=1;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element found at "+i+" index");
				found = true;
				break;
			}else i++;
		}
		if(!found) {
			System.out.println("Not Not Found");
		}
	}
}
