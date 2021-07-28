package estrutura_condicional_05;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[][] intervals = { { 0, 25 }, { 25, 50 }, { 50, 75 }, { 75, 100 } };

		System.out.print("Digite um número -> ");
		double num = sc.nextDouble();

		boolean containsInterval = false;
		String msg = "Fora de intervalo";

		for (int i = 0; i < intervals.length; i++) {
			double start = intervals[i][0];
			double end = intervals[i][1];
			if (num >= start && num <= end) {
				containsInterval = true;
				msg = "[" + (int) start + ", " + (int) end + "]\n";
			}
		}

		if (containsInterval) {
			System.out.print("Intervalo ");
		}
		System.out.println(msg);

		sc.close();
	}
}
