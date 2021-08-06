package estrutura_condicional_05;

public class Condicao_Ternaria {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		preco -= desconto;
 		System.out.println(preco);
	}

}
