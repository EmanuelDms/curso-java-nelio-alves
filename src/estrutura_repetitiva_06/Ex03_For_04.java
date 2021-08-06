package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de casos -> ");
		int casesNum = sc.nextInt();

		double numerador = 0.0, denominador = 0.0;

		for (int i = 0; i < casesNum; i++) {
			System.out.print("Numerador -> ");
			numerador = sc.nextDouble();

			System.out.print("Denominador -> ");
			denominador = sc.nextDouble();
			
			if (denominador == 0.0) {
				System.out.println("divisão impossível");
			}else {
				System.out.printf("%.1f%n" ,numerador / denominador);
			}
		}

		sc.close();
	}
}
