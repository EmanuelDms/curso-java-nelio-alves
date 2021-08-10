package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	// 'public' indica que a função (método) pode ser usada em outro arquivo
	// <tipo> o tipo de retorno da operação
	// <visualizacao> <tipo> <nome do método>(<parametros>){}
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
