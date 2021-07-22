package estrutura_sequencial_04;
import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cálculo de diferença!");
		System.out.print("Digite:\nA -> ");
		int A = sc.nextInt();
		
		System.out.print("B -> ");
		int B = sc.nextInt();
		
		System.out.print("C -> ");
		int C = sc.nextInt();
		
		System.out.print("D -> ");
		int D = sc.nextInt();
		
		int diff = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d", diff);
		
		sc.close();
	}

}
