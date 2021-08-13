package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
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