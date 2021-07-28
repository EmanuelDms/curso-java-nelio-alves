package estrutura_condicional_05;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*			  +|+
		  q2   |   q1
	   -_______|_______+
	   -	   |o	   +
		  q3   |   q4
			 - | -
		q1 => +x, +y
		q2 => -x, +y
		q3 => -x, -y
		q4 => +x, -y
		o  => x = y = 0
		Eixo X => y = 0
		Eixo Y => x = 0
			 *
			 */
		System.out.println("Em qual quadrante está o seu ponto????");
		System.out.print("* Informe o x => ");
		double x = sc.nextDouble();
		System.out.print("* Informe o y => ");
		double y = sc.nextDouble();

		sc.close();
		
		String msg = "";

		if (x > 0 && y > 0) {
			msg = "Q1";
		}else if (x < 0 && y > 0){
			msg = "Q2";
		}else if (x < 0 && y < 0) {
			msg = "Q3";
		}else if (x > 0 && y < 0) {
			msg = "Q4";
		}else if (y == 0) {
			msg = "Eixo X";
		}else if (x == 0){
			msg = "Eixo Y";
		}else if (x == 0 && y == 0) {
			msg = "Origem";
		}
		System.out.println(msg);
	}

}
