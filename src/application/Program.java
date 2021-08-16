package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("* Enter product data:");

		System.out.print("Name -> ");
		String name = sc.nextLine();

		System.out.print("Price -> ");
		double price = sc.nextDouble();

		/*
		 * System.out.print("Quantity in stock -> "); int quantity = sc.nextInt();
		 */

		Product product = new Product(name, price/* , quantity */);

		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());

		System.out.println("* Product data: " + product);

		System.out.print("Enter the number of products to be " + "added in stock: ");
		product.AddProducts(sc.nextInt());

		System.out.println("* Updated Product data: " + product);

		System.out.print("Enter the number of products to be " + "removed from stock: ");
		product.RemoveProducts(sc.nextInt());

		sc.close();

		System.out.println("* Updated Product data: " + product);

		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getQuantity());
	}

}
