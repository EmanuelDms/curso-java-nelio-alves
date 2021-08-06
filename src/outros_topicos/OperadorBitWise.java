package outros_topicos;

import java.util.Scanner;

public class OperadorBitWise {
	public static void main(String [] args) {
		int n1 = 89, n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mask = 0b100000;
		
		System.out.print("6th bit is ");
		if ((n & mask) != 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}
	
}
