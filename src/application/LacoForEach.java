package application;

public class LacoForEach {
	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		// para cada objeto 'obj', contido no vetor 'vect', faça:
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
