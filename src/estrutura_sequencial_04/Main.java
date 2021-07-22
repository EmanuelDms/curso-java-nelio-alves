package estrutura_sequencial_04;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		System.out.print("Bom dia!");
		System.out.println("\nAgora terá uma quebra de linha sem comandos!");
		System.out.println("Aconteceu e você nem viu.");

		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);

		Locale.setDefault(new Locale("pt", "BR"));

		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		System.out.println("Resultado é " + x + " metros.");
		System.out.printf("O resultado é %.2f metros.%n", x);
		System.out.println("Teste");

		String nome = "Emanuel";
		int idade = 18;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos de idade e ganha %.2f reais por mês.%n", nome, idade, renda);

	}
}