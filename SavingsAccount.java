/*

 * Class: CMSC203 

 * Instructor: Grinberg

 * Assignment 1

 * Description: Create different classes that use inheritance

 * Due: 04/8/24
 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming

 * assignment independently. I have not copied the code

 * from a student or any source. I have not given my code

 * to any student.

   Print your Name here: Jeffrey Navarro

*/
public class SavingsAccount extends BankAccount
{
	private static double rate = 0.025;
	private int savingsNumber = -1;
	private String accountNumber;
	
	public SavingsAccount(String name, double initial)
	{
		super(name, initial);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest()
	{
		double interest = getBalance() * rate / 12;
		deposit(interest);
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public SavingsAccount(SavingsAccount originalAccount, double initialBalance)
	{
		super(originalAccount, initialBalance);
		savingsNumber = originalAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}
