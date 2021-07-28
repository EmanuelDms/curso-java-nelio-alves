package estrutura_condicional_05;

import java.util.Scanner;

public class Ex02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DURAÇÃO DE UM JOGO!");
		System.out.print("Sobre o jogo, digite:\nHora Inicial -> ");
		int horaInicial = sc.nextInt();
		System.out.print("Hora Final -> ");
		int horaFinal = sc.nextInt();
		
		int tempoDuracao;
			
		if (horaInicial < horaFinal) {
			tempoDuracao = horaFinal - horaInicial;
		}else {
			tempoDuracao = 24 - (horaInicial - horaFinal);
		}
		
		System.out.println("O JOGO DUROU " + tempoDuracao + " HORA(S)");
		
		sc.close();
	}

}
