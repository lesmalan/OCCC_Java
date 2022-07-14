/**
 * Author:		Les Malan
 * Date:		06/23/22
 * File:		SavingsAccountRunner.java
 * Description: This program passes info to SavingsAccount.java
 */

import java.util.Scanner;
import java.util.Formatter;

public class SavingsAccountRunner 
{

	public static void main(String[] args) 
	{
		// Create input objects
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		Formatter formatter = new Formatter();
		
		// Capture account information
		System.out.println("Welcome to your savings account app!");
		System.out.print("Please enter your account number: ");
		int acctID = input.nextInt();
		System.out.print("Please enter your initial balance: ");
		double acctBalance = input.nextDouble();
		System.out.print("Please enter your annual interest rate (eg 1.125): ");
		double annualIntRate = input.nextDouble() / 100;
		System.out.println("");
		boolean openMenu = true;
		
		// Create account
		SavingsAccount Acct1 = new SavingsAccount(acctID, acctBalance);
		do
		{	
		// Display menu
		System.out.println("=============================");
		System.out.println("=       OPTIONS BELOW       =");
		System.out.println("=============================");
		System.out.println("1. Deposit");
		System.out.println("2. View Weekly Interest Amount");
		System.out.println("3. View Account Details");
		System.out.println("4. Exit");
		
		// Capture menu selection
		System.out.print("Please enter your selection: ");
		int menuSelection = input.nextInt();
		while (menuSelection < 1 || menuSelection > 4) 
		{
			System.out.print("INVALID SELECTION: Please enter your selection: ");
			menuSelection = input.nextInt();
		}
		
		// menu items
		if (menuSelection == 1)
		{
			System.out.println("");
			System.out.print("Please enter an amount to deposit: ");
			double depositAmount = input.nextDouble();
			acctBalance = Acct1.deposit(depositAmount);
			System.out.printf("New balance: $%.2f", Acct1.getAcctBalance());
			System.out.println("");
			System.out.println("");
		}
		
		if (menuSelection == 2)
		{
			System.out.println("");
			System.out.printf("Your weekly interest amount is: $%.2f", Acct1.getWeeklyIntAmount(acctBalance, annualIntRate));
			System.out.println("");
		}
		
		if (menuSelection == 3)
		{
			System.out.println("");
			System.out.println("Account ID: " + Acct1.getAcctID());
			System.out.println("Account Creation Date/Time: " + Acct1.getAcctOpenDate());
			System.out.printf("Balance: $%.2f", Acct1.getAcctBalance());
			System.out.println("");
			System.out.printf("Weekly Interest Amount: $%.2f", Acct1.getWeeklyIntAmount(acctBalance, annualIntRate));
			System.out.println("");
			System.out.println("");
		}
		if (menuSelection == 4)
		{
			System.out.println("");
			System.out.println("Thank you for using the savings account app.");
			System.out.println("PROGRAM TERMINATED");
			System.exit(0);
		}
		} while (openMenu = true);
		
		
	}
}