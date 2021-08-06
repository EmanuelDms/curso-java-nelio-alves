package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número -> ");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = num; i >= 1; i--) {
			if (num % i == 0) {
				System.out.println(num / i);
			}
		}
		
	}

}
