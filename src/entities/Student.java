package entities;

public class Student {
	public String nome;
	public double n1, n2, n3;

	public double calcularNota() {
		return n1 + n2 + n3;
	}
	
	public void seAprovado() {
		double sumGrades = calcularNota();
		if (sumGrades >= 60.00) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", (60 - sumGrades));
		}
	}
}
