package estrutura_condicional_05;

import java.util.Scanner;

public class Ex02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		String msg;
		
		if (num < 0) {
			msg = "NEGATIVO";
		}else {
			msg = "NÃO NEGATIVO";
		}
		System.out.println(msg);
		
		sc.close();
	}

}
