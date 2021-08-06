package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_For_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cálculo de fatorial\nDigite o número -> ");
		int num = sc.nextInt();
		
		sc.close();
		
		int fat = 1;
		
		for (int i = 1; i <= num; i++) {
			if (num == 0) { 
				i = num + 1;
			}else {
				fat *= i;
			}
		}
		
		System.out.println(fat);

	}

}
