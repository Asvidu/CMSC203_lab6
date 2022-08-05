public class SavingsAccount extends BankAccount{
	private final double rate = 0.025;
	private static int savingsNumber = 0;
	private String accountNumber;
	
	//constructor for savings account
	 
	public SavingsAccount(String name, double amount) 
	{
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-" + savingsNumber);
		
	}
	
	 //copy constructor for savings account
	
	public SavingsAccount(SavingsAccount newSvgAccount, double balance) 
	{
		super(newSvgAccount, balance);
		savingsNumber += 1;
		this.accountNumber = newSvgAccount.accountNumber;
	}
	
	//calculate fee
	public void postInterest() 
	{
		//monthly rate
		double monthlyRate = (rate / 12);
		
		//monthly fees
		double monthlyInterest = monthlyRate * getBalance();
		
		//deposit
		deposit(monthlyInterest);
	}
	
	//return the account number
	
	@Override
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	
	
}