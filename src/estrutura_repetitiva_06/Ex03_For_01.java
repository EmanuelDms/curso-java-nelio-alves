package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "Insira um número maior que 1 e menor que 1000\n-> ";

		System.out.print(msg);
		int x = sc.nextInt();

		while (x < 1 || x > 1000) {
			System.out.print(msg);
			x = sc.nextInt();
		}

		for (int i = 1; i <= x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
