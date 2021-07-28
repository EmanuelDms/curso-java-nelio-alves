package estrutura_condicional_05;

import java.util.Scanner;
import java.util.Locale;

public class Ex02_05_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÓDIGO	ESPECIFICAÇÃO	PRECO\n"
				+ "1	Cachorro Quente	4.00\n"
				+ "2	X-Salada	4.50\n"
				+ "3	X-Bacon	5.00\n"
				+ "4	Torrada simples	2.00\n"
				+ "5	Refrigerante	1.50");
		
		System.out.print("Insira o código do produto -> ");
		int codigo = sc.nextInt();
		System.out.print("Insira quantidade do produto -> ");
		int quantidade = sc.nextInt();
		
		double produtoPreco = 0.00;
		
		if (codigo == 1) {
			produtoPreco = 4.00;
		}else if (codigo == 2) {
			produtoPreco = 4.50;
		}else if (codigo == 3) {
			produtoPreco = 5.00;
		}else if (codigo == 4) {
			produtoPreco = 2.00;
		}else if (codigo == 5) {
			produtoPreco = 1.50;
		}
		
		double total = produtoPreco * quantidade;
		
		System.out.printf("Total: R$%.2f", total);
		
		sc.close();
	}

}
