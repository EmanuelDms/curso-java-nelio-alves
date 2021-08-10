package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramEx03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Student jimHalpert = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome -> ");
		jimHalpert.nome = sc.nextLine();
		
		jimHalpert.n1 = sc.nextDouble();
		jimHalpert.n2 = sc.nextDouble();
		jimHalpert.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", jimHalpert.calcularNota());
		
		jimHalpert.seAprovado();
		
		sc.close();
		

	}

}
