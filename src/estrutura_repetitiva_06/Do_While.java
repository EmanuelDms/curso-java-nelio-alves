package estrutura_repetitiva_06;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char repetir;

		do {
			System.out.print("\nDigite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();

			double fahrenheit = ((9 * celsius) / 5) + 32;

			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);

			System.out.print("Deseja repetir (s/n)? ");
			repetir = sc.next().charAt(0);
		} while (repetir == 's');

		sc.close();

	}

}
