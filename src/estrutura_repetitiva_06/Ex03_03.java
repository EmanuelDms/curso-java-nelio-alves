package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Cria array de nome de produtos
		String[] availableOptionsTitle = { "Álcool", "Gasolina", "Diesel"};

		System.out.println("Código\tOpções");
		int i = 0;
		while (i < availableOptionsTitle.length) {
			System.out.printf("%d\t%s%n", (i + 1), availableOptionsTitle[i]);
			i++;
		}
		
		System.out.println("(para cancelar, digite qualquer número)");

		int[] availableOptionsCount = new int[availableOptionsTitle.length];

		System.out.print("Código da opção desejada -> ");
		int option = sc.nextInt();

		// Lista dados		
		while (option >= 1 && option <= availableOptionsTitle.length) {
			// torna option válido para iteração
			option--;

			i = 0;
			while (i < availableOptionsCount.length) {
				if (option == i)
					availableOptionsCount[i]++;
				i++;
			}
			System.out.print("\n(para cancelar, digite qualquer número)\nCódigo da opção desejada -> ");
			option = sc.nextInt();
		}

		sc.close();

		i = 0;
		System.out.println("MUITO OBRIGADO!");
		
		// Lista opções e seus valores		
		while (i < availableOptionsTitle.length) {
			System.out.printf("%s: %d%n", availableOptionsTitle[i], availableOptionsCount[i]);
			i++;
		}
	}

}
