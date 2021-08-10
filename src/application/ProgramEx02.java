package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee temp = new Employee();
		Locale.setDefault(Locale.US);

		System.out.print("Name: ");
		temp.name = sc.nextLine();

		System.out.print("Gross Salary: ");
		temp.grossSalary = sc.nextDouble();

		System.out.print("Tax (in $): ");
		temp.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, $ %.2f%n", temp, temp.netSalary());
		
		System.out.print("\nWhich percentage to increase salary? (in %)\n->");
		temp.increaseSalary(sc.nextDouble());
		
		System.out.printf("\nUpdated data: %s, %.2f", temp, temp.netSalary());

		sc.close();

	}

}
