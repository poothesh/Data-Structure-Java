package Day2;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int val = value;
        String numberStr = Integer.toString(value);
        int length = numberStr.length();
		sc.close();
		int sum = 0;
		while(value > 0) {
			int temp = value%10;
			sum += (int)Math.pow(temp, length);
			value/=10;
		}
		if(val == sum) System.out.println("ARMSTRONG");
		else System.out.println("NOT ARMSTRONG");
	}

}
