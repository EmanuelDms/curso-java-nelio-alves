package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	public static final double tax = 5.00;

	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	// if was there a initialDeposit
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= (amount + tax);
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", number, holder, balance);
	}

}
