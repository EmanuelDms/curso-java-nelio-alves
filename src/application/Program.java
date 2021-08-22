package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];

		double sumPrice = 0.0;
		double sumHeight = 0.0;
		for (int i = 0; i < vect.length; i++) {
			vect[i] = new Product();

			sc.nextLine();
			vect[i].setName(sc.nextLine());
			vect[i].setPrice(sc.nextDouble());
			vect[i].setHeight(sc.nextDouble());

			sumPrice += vect[i].getPrice();
			sumHeight += vect[i].getHeight();
		}

		double avgPrice = sumPrice / vect.length;
		double avgHeight = sumHeight / vect.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avgPrice);
		System.out.printf("AVERAGE HEIGHT = %.2f", avgHeight);
		sc.close();
	}

}