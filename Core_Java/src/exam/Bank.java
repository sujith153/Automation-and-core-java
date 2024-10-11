package exam;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<BankAccount> bankAccounts;

	public Bank() {
		bankAccounts = new ArrayList<>();
	}

	public void addAccount(BankAccount account) {
		bankAccounts.add(account);
	}

	public double getTotalInterest(int years) {
		double totalInterest = 0;
		for (BankAccount account : bankAccounts) {
			totalInterest += account.getInterest(years);
		}
		return totalInterest;
	}

	public static void main(String[] args) {
		List<String> transactions = new ArrayList<>();

		Bank bank = new Bank();

		SavingAccount savingAccount = new SavingAccount(1000, 0.05, transactions);
		CurrentAccount currentAccount = new CurrentAccount(1000, 0.05, transactions);

		bank.addAccount(savingAccount);
		bank.addAccount(currentAccount);

		int years = 1;
		System.out.println("Total Interest: " + bank.getTotalInterest(years));
	}

}
