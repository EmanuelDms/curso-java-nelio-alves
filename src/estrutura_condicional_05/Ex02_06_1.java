package estrutura_condicional_05;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_06_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número -> ");
		double num = sc.nextDouble();

		sc.close();
		System.out.print("Interval [");
		
		if (num >= 0.0 && num < 25.0) {
			System.out.print("0, 25");
		} else if (num >= 25.0 && num < 50.0) {
			System.out.print("25, 50");
		} else if (num >= 50.0 && num < 75.0) {
			System.out.print("50, 75");
		} else if (num >= 75.0 && num <= 100.0) {
			System.out.print("75, 100");
		}

		System.out.println("]");
	}

}
