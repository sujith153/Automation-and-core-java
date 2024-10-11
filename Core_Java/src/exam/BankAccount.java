package exam;

import java.util.List;

public abstract class BankAccount {
	protected double amount;
	protected double rateOfInterest;
	protected List<String> transactions;

	public BankAccount(double amount, double rateOfInterest, List<String> transactions) {
		this.amount = amount;
		this.rateOfInterest = rateOfInterest;
		this.transactions = transactions;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public List<String> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}

	public abstract double getInterest(int years);

}
