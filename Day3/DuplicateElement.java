package Day3;

import java.util.Scanner;

public class DuplicateElement {

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
		
		duplicateElement(arr,N);
	}

	private static void duplicateElement(int[] arr, int N) {
		// TODO Auto-generated method stub
		boolean found = false;
		for(int i=0;i < N; i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i]==arr[j]) {
					found = true;
					System.out.println("Duplicate element found: " + arr[i]);
                    return;
				}
			}
		}
		if(!found) {
			System.out.print("Duplicate Element Not Found");
		}
	}

}
