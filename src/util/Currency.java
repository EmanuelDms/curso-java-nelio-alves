package util;

/**
 * @author emanueldms
 */
public class Currency {
	public static double IOF = 0.06;
	
	/**
	 * Converts <em>dolarValueBought</em> to reals based on <em>dolarPrice</em>.
	 */
	public static double dollarToReal(double dolarPrice, double amount) {
		double dollarInReal = amount * dolarPrice;
		return dollarInReal + (dollarInReal * IOF) ;
	}
}
