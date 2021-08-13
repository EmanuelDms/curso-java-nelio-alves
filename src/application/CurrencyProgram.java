package application;

import util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();

		sc.close();

		System.out.printf("Amount to be paid in reais = %.2f", Currency.dollarToReal(dollarPrice, amount));

	}

}
