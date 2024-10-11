package exam;

import java.util.List;

public class SavingAccount extends BankAccount{

    public SavingAccount(double amount, double rateOfInterest, List<String> transactions) {
        super(amount, rateOfInterest, transactions);
    }

    @Override
    public double getInterest(int years) {
        int n = 12; // monthly compounding
        return amount * Math.pow((1 + rateOfInterest / n), n * years) - amount;
    }
	

}
