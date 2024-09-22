package practice9_5;

import java.text.NumberFormat;
/**
* This is the class to create the account objects
* Each object is one customer's bank account
* @author Stephanie Sarambo
*/
public class Bank {
	private String id;
	private String name;
	private double balance;
	/**
	 * a public static variable for the interest rates
	 */
	public static final double INTEREST = 0.065;
	private static int totalAccounts = 0;
/**
 * The bank account object
 * Creates new accounts for each customer
 * @param id - the unique ID for each customer
 * @param name - the customer's name
 */
	public Bank(String id, String name)
	{
		this.id = id;
		this.name = name;
		balance = 0;
		totalAccounts += 1;
	}
	
	/**
	 * returns the customer's name
	 * @return name in String
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * returns the customer's ID
	 * @return id in String
	 */
	public String getID()
	{
		return id;
	}
	
	/**
	 * allows customer to withdraw from their account
	 * @param amount of money to take out
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Your new balance is $" + balance);
	}
	
	/**
	 * allows customer to deposit into their account
	 * @param amount of money to add
	 */
	public void deposit(double amount)
	{
		String format;
		balance += amount;
		format = NumberFormat.getCurrencyInstance().format(balance);
		System.out.println("Your new balance is " + format);
	}
	
	/**
	 * returns the customer's current balance
	 * @return balance in double
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * returns the current interest rate
	 * @return interest in double
	 */
	public double getInterest()
	{
		return INTEREST;
		
	}
	
	/**
	 * returns total number accounts at this bank
	 * @return total in int
	 */
	public int getTotal()
	{
		return totalAccounts;
	}
}
