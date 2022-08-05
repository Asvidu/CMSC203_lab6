public class CheckingAccount extends BankAccount {

	private static final double FEE = 0.15; //0.15

	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + "-10");
	}

	@Override
	public boolean withdraw(double amount) {
		// calculate amount after fees
		double amountAfterFees = (amount + FEE);
		return super.withdraw(amountAfterFees);
	}

}