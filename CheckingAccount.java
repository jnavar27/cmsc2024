
public class CheckingAccount extends BankAccount
{
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initial)
	{
		super(name, initial);
		setAccountNumber(getAccountNumber() + "-10");
	}
	@Override
	public boolean withdraw(double amount)
	{
		amount += FEE;
		boolean withdrawl = super.withdraw(amount);
		return withdrawl;
	}
}
