package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número inteiro positivo -> ");
		int num = sc.nextInt();

		sc.close();

		for (int i = 1; i <= num; i++) {
			System.out.printf("%d %.0f %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
		}
	}

}
