package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.nextInt() != 2002) {
			System.out.print("Senha inválida!\nTente novamente -> ");
		}
		System.out.println("=================\nAcesso permitido!\n=================");
		
		sc.close();

	}

}
