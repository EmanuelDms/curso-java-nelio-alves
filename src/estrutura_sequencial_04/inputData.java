package estrutura_sequencial_04;
import java.util.Scanner;
//import java.util.Locale;

public class inputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		// consome espaço pendente do nextInt()
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.printf("%d%n%s%n%s%n%s%n", x, s1, s2, s3);

		sc.close();
	}

}
