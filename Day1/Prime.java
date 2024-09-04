package Day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		if(isPrime(value)) {
			System.out.println("PRIME");
		}else {
			System.out.println("NOT PRIME");
		}
		sc.close();
	}

	private static boolean isPrime(int value) {
	    if (value <= 1) {
	        return false;
	    }
	    for (int i=2; i<=Math.sqrt(value);i++) {
	        if (value % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
}

	
