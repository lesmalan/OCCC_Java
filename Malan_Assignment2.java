/**
 * Author:		Les Malan
 * Date:		06/08/22
 * File:		Malan_Assignment2
 * Description: This program is a library inventory management system
 */

import java.util.Scanner;

public class Malan_Assignment2 {

public static void main(String[] args) {
	// create input variable to accept data from console. 
	Scanner input = new Scanner(System.in);
	Scanner keyboard = new Scanner(System.in);
	
	// declare variables
	int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, booksProcessed = 0, booksReturned = 0, booksCheckedOut = 0;
	char continueYN = 'Y';
	
	//display header
	
	System.out.println("************************************************");
	System.out.println("* Welcome to the Daily Book Inventory Program! *");
	System.out.println("************************************************");
	
	// I put the whole thing in a do-while loop to make the continue? YN function work
	do {
	// prompt user for ISBN and validate length is 12 characters
	System.out.println("Enter the first 12 digits of an ISBN-13 as a String: ");
	String isbnInput = keyboard.nextLine();
	while (isbnInput.length() != 12) {
		System.out.println("ERROR: ISBN input must be 12 characters");
		System.out.println("Enter the first 12 digits of an ISBN-13 as a String: ");
		isbnInput = keyboard.nextLine();
	}
	
	// This block converts the char values from the isbnInput string into ints. Not sure if this is "right" but it works
	d1 = isbnInput.charAt(0) - '0';
	d2 = isbnInput.charAt(1) - '0';
	d3 = isbnInput.charAt(2) - '0';
	d4 = isbnInput.charAt(3) - '0';
	d5 = isbnInput.charAt(4) - '0';
	d6 = isbnInput.charAt(5) - '0';
	d7 = isbnInput.charAt(6) - '0';
	d8 = isbnInput.charAt(7) - '0';
	d9 = isbnInput.charAt(8) - '0';
	d10 = isbnInput.charAt(9) - '0';
	d11 = isbnInput.charAt(10) - '0';
	d12 = isbnInput.charAt(11) - '0';
	
	// calculate the ISBN checksum
	int isbnChecksum = 10 - ((d1 + (3*d2) + d3 + (3*d4) + d5 + (3*d6) + d7 + (3*d8) + d9 + (3*d10) + d11 + (3*d12))%10);
	if (isbnChecksum == 10) {
		isbnChecksum = 0;
	}
	
	// Display ISBN input from user followed by checksum
	System.out.println("The ISBN-13 number is " + isbnInput + isbnChecksum);
	
	// Checkout and return section. This iterates the counts for the output.
	System.out.println("");
	System.out.print("Enter 'R' for return or 'C' for check out:");
	String returnCheckOut = keyboard.nextLine();
	String R = "R"; 
	String C = "C";
	while (!(returnCheckOut.equals(R) || returnCheckOut.equals(C))){
		System.out.println("ERROR: invalid entry");
		System.out.print("Enter 'R' for return or 'C' for check out:");
		returnCheckOut = keyboard.nextLine();
	}
	if (returnCheckOut.equals(R)) {
		booksProcessed++;
		booksReturned++;
	}
	if (returnCheckOut.equals(C)) {
		booksProcessed++;
		booksCheckedOut++;
	}
	// Output section
	System.out.println("************************************************");
	System.out.println("*             Daily Book Inventory             *");
	System.out.println("************************************************");
	System.out.println("Number of books returned: " + booksReturned);
	System.out.println("Number of books checked out: " + booksCheckedOut);
	System.out.println("The total of books processed: " + booksProcessed);
	System.out.println("************************************************");
	System.out.print("Enter 'Y' to continue, 'N' to quit: ");
	continueYN = input.next().charAt(0);
	System.out.println("");
	
	} while (continueYN == 'Y'); // this is the end of the do-while loop. Technically, you can enter anything that's not Y and it will exit the loop
	
	// final output
	System.out.println("************************************************");
	System.out.println("*             Daily Book Inventory             *");
	System.out.println("************************************************");
	System.out.println("Number of books returned: " + booksReturned);
	System.out.println("Number of books checked out: " + booksCheckedOut);
	System.out.println("The total of books processed: " + booksProcessed);
	System.out.println("************************************************");
	
	System.exit(0);
	}
}