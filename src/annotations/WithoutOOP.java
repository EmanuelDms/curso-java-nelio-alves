package annotations;

import java.util.Locale;
import java.util.Scanner;

public class WithoutOOP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter measures of triangle X: ");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double p = (a + b + c) / 2;
		double areaX = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Enter measures of triangle Y: ");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		p = (a + b + c) / 2;
		double areaY = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.println("Larger area: " + ((areaX > areaY) ? "X" : "Y"));

		sc.close();

	}

}
