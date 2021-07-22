package estrutura_sequencial_04;
import java.util.Scanner;

public class Ex02_01 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("SOMA!\nPrimeiro valor -> ");
		int n1 = sc.nextInt();

		System.out.print("Segundo valor -> ");
		int n2  = sc.nextInt();
		
		double soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
