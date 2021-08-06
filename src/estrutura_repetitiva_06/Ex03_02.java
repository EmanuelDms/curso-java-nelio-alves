package estrutura_repetitiva_06;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira as coordenadas (x y):\n-> ");
		int x = sc.nextInt(), y = sc.nextInt();

		while (x != 0 || y != 0) {
			String msg = "";
			if (x > 0 && y > 0) {
				msg = "primeiro";
			} else if (x < 0 && y > 0) {
				msg = "segundo";
			} else if (x < 0 && y < 0) {
				msg = "terceiro";
			} else if (x > 0 && y < 0) {
				msg = "quarto";
			}
			System.out.println(msg);

			System.out.print("Insira as coordenadas (x y):\n->");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

}
