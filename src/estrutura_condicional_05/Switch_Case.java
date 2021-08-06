package estrutura_condicional_05;

import java.util.Locale;
import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("De 1 a 7, informe um número para representar o dia da semana\nDigite aqui -> ");
		int numDay = sc.nextInt();
		boolean verify = false;

		sc.close();

		String day = "";
		switch (numDay) {
		case 1:
			day = "domingo";
			verify = true;
			break;
		case 2:
			day = "segunda";
			verify = true;
			break;
		case 3:
			day = "terça";
			verify = true;
			break;
		case 4:
			day = "quarta";
			verify = true;
			break;
		case 5:
			day = "quinta";
			verify = true;
			break;
		case 6:
			day = "sexta";
			verify = true;
			break;
		case 7:
			day = "sábado";
			verify = true;
			break;

		default:
			day = "Digite um número válido!";
			break;
		}

		if (verify) {
			System.out.println("Hoje é " + day);
		} else {
			System.out.println(day);
		}
	}

}
