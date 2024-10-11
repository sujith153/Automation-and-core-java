package exam;

import java.util.List;

public class CurrentAccount extends BankAccount{
	public CurrentAccount(double amount, double rateOfInterest, List<String> transactions) {
        super(amount, rateOfInterest, transactions);
    }

    @Override
    public double getInterest(int years) {
        int n = 4; // quarterly compounding
        return amount * Math.pow((1 + rateOfInterest / n), n * years) - amount;
    }

}
