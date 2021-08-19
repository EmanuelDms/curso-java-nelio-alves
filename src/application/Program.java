package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		avgHeight(vect, sc);

		sc.close();
	}

	public static void avgHeight(double[] arr, Scanner sc) {
		double sum = 0.0;
		int i = 0;

		while (i < arr.length) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
			i++;
		}

		double avg = sum / i;

		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
	}

}