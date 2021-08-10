package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program1 {

	public static void main(String[] args) {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("* Enter product data:");

		System.out.print("Name -> ");
		product.name = sc.nextLine();

		System.out.print("Price -> ");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock -> ");
		product.quantity = sc.nextInt();

		System.out.println("* Product data: " + product);

		System.out.print("Enter the number of products to be " + "added in stock: ");
		product.AddProducts(sc.nextInt());

		System.out.println("* Updated Product data: " + product);

		System.out.print("Enter the number of products to be " + "removed from stock: ");
		product.RemoveProducts(sc.nextInt());

		sc.close();

		System.out.println("* Updated Product data: " + product);

	}

}
