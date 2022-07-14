/**
 * Author:		Les Malan
 * Date:		06/23/22
 * File:		SavingsAccount.java
 * Description: Performs balance, deposits, and interest calculations for a bank savings account
 */

import java.util.Date;

public class SavingsAccount 
{
	// declare private variables
	private int id = 0;
	private double balance, annualIntRate;
	private Date dateEstablished;

	// no argument constructor for default savings account
	public SavingsAccount()
	{
		//create  savings account
		this.dateEstablished = new Date();
	}
	
	// constructor with arguments
	public SavingsAccount(int id, double balance)
	{
		this.id = id;
		this.balance = balance; 
		this.dateEstablished = new Date();
	}
	
	// getters
	public int getAcctID()
	{
		return id;
	}
	
	public double getAcctBalance()
	{
		return balance;
	}
	
	public double getAcctIntRate()
	{
		return annualIntRate;
	}
	
	public Date getAcctOpenDate()
	{
		return dateEstablished;
	}
	
	
	// setters
	public void setAcctID(int id)
	{
		this.id = id;
	}
	
	public void setAcctBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setAcctIntRate(double annualIntRate)
	{
		this.annualIntRate = annualIntRate;
	}
	
	public double getWeeklyIntAmount(double balance, double annualIntRate) 
	{
		double weeklyIntAmount = balance * (annualIntRate / 52);
		return weeklyIntAmount;
	}
	
	public double deposit(double depositAmount)
	{
		balance += depositAmount;
		return balance;
	}
}
	





