package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de casos -> ");
		int num = sc.nextInt();
		int in = 0, out = 0;

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "º número -> ");
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in\n" + out + " out");

		sc.close();
	}

}
