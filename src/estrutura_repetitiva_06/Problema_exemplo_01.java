package estrutura_repetitiva_06;

import java.util.Scanner;

public class Problema_exemplo_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(), sum = 0;

		while (num != 0) {
			sum += num;
			num = sc.nextInt();
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
