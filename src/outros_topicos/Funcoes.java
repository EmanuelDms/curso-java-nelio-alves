package outros_topicos;

import java.util.Scanner;

public class Funcoes {
	// TODO Determinando qual o maior e menor número independente da quantidade de
	// números

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("* What is the quantity of numbers do you want to input\n-> ");

		int[] arrNumbers = generateIntegerNumbers(sc.nextInt());
		arrNumbers = sortArrayDesc(arrNumbers);

		System.out.printf("* Higher: %d%n", arrNumbers[0]);
		System.out.printf("* Lower: %d%n", arrNumbers[arrNumbers.length - 1]);

		sc.close();

	}

	public static int[] generateIntegerNumbers(int n) {
		int[] arr = new int[n];

		System.out.println("* Enter:");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d: ", (i + 1));
			arr[i] = sc.nextInt();
		}

		sc.close();
		/*
		 * Printing array System.out.println(Arrays.toString(arr));
		 */
		return arr;
	}

	public static int[] sortArrayDesc(int[] arr) {

		// variável existe somente no escopo da função
		int tempVar;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tempVar = arr[j];
					arr[j] = arr[i];
					arr[i] = tempVar;
				}
			}
		}

		return arr;
	}

}
