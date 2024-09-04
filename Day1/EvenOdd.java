package Day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		
		
		if(value%2==0) System.out.println("EVEN");
		else System.out.println("ODD");
		
		sc.close();
	}

}
