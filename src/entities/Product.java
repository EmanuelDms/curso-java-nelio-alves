package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	/** 
	 * Construtor padrão
	 */
	public Product() {
	};

	/**
	 * Construtor completo
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * Construtor sem quantidade de estoque
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double TotalValueInStock() {
		return price * quantity;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	/*
	 * Sobreposição de métodos (override)
	 */
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " unit(s)" + "\n- Total: $ "
				+ String.format("%.2f", TotalValueInStock()) + "\n";
	}

}