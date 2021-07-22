package estrutura_condicional_05;

import java.util.Scanner;

public class If_else {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		/* O usuário deseja receber uma mensagem de bom dia, boa tarde ou boa noite
		 * Se for de manhã, bom dia, se a tarde, boa tarde e se de noite boa noite
		 */
		System.out.print("Que horas são? -> ");
		double hours = sc.nextDouble();
		
		String msg;
		if (hours >= 5.0 && hours < 12.0) {
			msg = "Bom dia!";
		}else if(hours >= 12.0 && hours < 18.0) {
			msg = "Boa tarde!";
		}else {
			msg = "Boa noite!";
		}
		
		System.out.println(msg);
		
		sc.close();
	}
}
