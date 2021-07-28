package estrutura_condicional_05;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("PAR OU ÍMPAR????????\nInsira um número:");
		int num = sc.nextInt();
		
		String msg;
		
		if (num % 2 == 0) {
			msg = "par";
		}else {
			msg = "ímpar";
		}

		System.out.println(msg.toUpperCase());
		
		sc.close();
	}

}
