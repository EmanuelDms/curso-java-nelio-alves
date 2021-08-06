package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de casos -> ");
		int casesNum = sc.nextInt();

		for (int i = 0; i < casesNum; i++) {
			System.out.println("====== " + (i + 1) + "º CASO ======");
			System.out.print("1º VALOR: ");
			double avg = sc.nextDouble() * 2.0;

			System.out.print("2º VALOR: ");
			avg += sc.nextDouble() * 3.0;

			System.out.print("3º VALOR: ");
			avg += sc.nextDouble() * 5.0;

			avg /= (2.0 + 3.0 + 5.0);

			System.out.println("====== Média: " + avg + " ======");

		}
		
		sc.close();

	}

}
