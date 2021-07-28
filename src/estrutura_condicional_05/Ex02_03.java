package estrutura_condicional_05;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		int b = sc.nextInt();
		
		String msg, multiplos = "Sao Multiplos";
		String naoMultiplos = "Nao " + multiplos;
		if (a % b == 0) {
			msg = multiplos;
		}else if (b % a == 0) {
			msg = multiplos;
		}else {
			msg = naoMultiplos;
		}
		
		System.out.print(msg);
		
		sc.close();
	}

}
