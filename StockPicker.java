/**
 * Author:		Les Malan
 * Date:		06/02/2022
 * File:		StockPicker.java
 * Description: This program calculates how many shares you can buy.
 */

import java.util.Scanner;

public class StockPicker {

public static void main(String[] args) {
	// create input variable to accept data from console and keyboard
	Scanner input = new Scanner(System.in);
	Scanner keyboard = new Scanner(System.in);
	
	// welcome user to program
	System.out.println("Welcome to the Stock Picker App!");
	System.out.println("");
	
	// prompt user for total investment and validate input. totalInvestment must be greater than $0
	System.out.print("Enter the total amount of money you are willing to invest: ");
	double totalInvestment = input.nextDouble();
	while (totalInvestment <= 0) {
		System.out.println("Error: amount must be greater than zero.");
		System.out.print("Enter the total amount of money you are willing to invest: ");
		totalInvestment = input.nextDouble();
	}
	
	// prompt user for stock ticker and validate input. stockTicker cannot exceed 5 characters.
	System.out.print("Enter the stock ticker: ");
	String stockTicker = keyboard.nextLine();
	while (stockTicker.length() > 5) {
		System.out.println("Error: stock ticker must be fewer than 6 characters.");
		System.out.print("Enter the stock ticker: ");
		stockTicker = keyboard.nextLine();
	}
	
	// prompt user for stock price and validate input. stockPrice must be at least $0.01.
	System.out.print("Enter the price: ");
	double stockPrice = input.nextDouble();
	while (stockPrice < 0.01) {
		System.out.println("Error: stock price must be at least $0.01");
		System.out.print("Enter the price: ");
		stockPrice = input.nextDouble();
	}
	
	// prompt user for P/E Ratio and validate input. If peRatio is greater than 60, a warning is generated in the results.
	System.out.print("Enter the P/E Ratio: ");
	double peRatio = input.nextDouble();
	System.out.println("");
	
	// calculate number of shares user can purchase
	double numberOfShares = totalInvestment / stockPrice;
	
	// display results on console
	System.out.println("Below are your results:");
	System.out.println("");
	System.out.println("Stock: " + stockTicker);
	System.out.println("Price: $" + stockPrice);
	System.out.println("P/E Ratio: " + peRatio);
	if (peRatio > 60) {
		System.out.println("WARNING: this company may be overvalued!");
	}
	System.out.println("# of shares able to purchase: " + (int)numberOfShares);
	
	}
}