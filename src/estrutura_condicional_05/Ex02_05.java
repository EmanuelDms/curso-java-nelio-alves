package estrutura_condicional_05;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String[] productsName = { "Cachorro Quente", "X-Salada", "X-Bacon", "Torrada simples", "Refrigerante" };
		double[] productsPrice = { 4.00, 4.50, 5.00, 2.00, 1.50 };
		
		System.out.println("CÓDIGO\tESPECIFICAÇÃO\tPRECO");
		for (int i = 0; i < productsPrice.length; i++) {
			System.out.printf("%d\t%s\t%.2f%n", (i+1), productsName[i], productsPrice[i]);
		}

		System.out.print("\nInforme o código -> ");
		int codigo = sc.nextInt();
		System.out.print("Informe a quantidade -> ");
		int quantidade = sc.nextInt();
		
		double total = (double) productsPrice[codigo - 1] * quantidade;

		System.out.printf("Total: R$%.2f" , total);

		sc.close();
	}

}
