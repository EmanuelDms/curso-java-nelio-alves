package estrutura_sequencial_04;
import java.util.Locale;
import java.util.Scanner;

public class exResolvido01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Sobre o terreno, insira:\nLargura (m) -> ");
		double largura = sc.nextDouble();
		System.out.print("Comprimento (m) -> ");
		double comprimento = sc.nextDouble();
		System.out.print("Valor do m² -> ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%nPRECO = %.2f", area, preco);
		
		sc.close();
	}
}
