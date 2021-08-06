package estrutura_repetitiva_06;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números inteiros que serão lidos\n-> ");
		// quantidade de números inteiros que serão lidos
		int qtdNum = sc.nextInt(), sum = 0;
		for (int i = 0; i < qtdNum; i++) {
			System.out.print((i + 1) + "º volta-> ");
			sum += sc.nextInt();
		}
		System.out.println("Total: " + sum);

	}

}
