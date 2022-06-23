// Les Malan
// OCCC Spring 2022
// Beginning Programming

#include <iostream>
#include <cctype>
#include <string>
#include <fstream>

using namespace std;

// Function Prototypes
void displayHeader();
string getFullPath(string&);
void openFileValidator(string);
bool checkPassword(string);
bool lengthChecker(string);
bool spacesChecker(string);
bool upperCaseChecker(string);
bool lowerCaseChecker(string);
bool digitChecker(string);
bool specialChecker(string);

int main()
{
	// Display header information 
	displayHeader();

	// Declare variables
	int validCount = 0, invalidCount = -1, totalChecked;
	string pw;

	// Open file
	string fileName;
	fstream inputFile;
	getFullPath(fileName);
	openFileValidator(fileName);
	inputFile.open(fileName);

	// Check passwords and tally valid/invalid
	while (inputFile)
	{
		getline(inputFile, pw);
		if (checkPassword(pw))
		{
			validCount++;
		}
		else
			invalidCount++;
	}

	// Display counts and total
	totalChecked = validCount + invalidCount;
	cout << "Number of valid passwords is " << validCount << endl;
	cout << "Number of invalid passwords is " << invalidCount << endl;
	cout << "Total number of passwords checked is " << totalChecked << endl;


	// Clean up
	inputFile.close();
	return 0;
}

// Function Definitions
//displayHeader - shows this text.
void displayHeader() {
	cout << "Password Checker Quiz\n";
	cout << "By Les Malan\n";
	cout << "2022\n";
	cout << "This program reads passwords from a file and checks that they meet requirements.\n";
	cout << "--------------------------------------------\n";
	cout << "\n";
	cout << "Password parameters:" << endl;
	cout << "	1. 12 characters or more." << endl;
	cout << "	2. No spaces." << endl;
	cout << "	3. At least 1 upper case character." << endl;
	cout << "	4. At least 1 lower case character." << endl;
	cout << "	5. At least 1 digit." << endl;
	cout << "	6. At least 1 special character." << endl;
}

// checkPassword -  this function runs given password through series of tests. Returns false if any fail, else returns true.
bool checkPassword(string password)
{
	if (!lengthChecker(password))
	{
		return false;
	}
	if (!spacesChecker(password))
	{
		return false;
	}
	if (!upperCaseChecker(password))
	{
		return false;
	}
	if (!lowerCaseChecker(password))
	{
		return false;
	}
	if (!digitChecker(password))
	{
		return false;
	}
	if (!specialChecker(password))
	{
		return false;
	}
	return true;
}

// lengthChecker - this function tests the password to make sure it passes the length parameter check.
bool lengthChecker(string password)
{
	if (password.length() < 12)
	{
		return false;
	}
	else
		return true;
}

// spacesChecker - this function tests the password to make sure it doesn't contain any spaces.
bool spacesChecker(string password)
{
	for (int i = 0; i < password.length(); i++)
	{
		if (isspace(password[i]))
		{
			return false;
		}
	}
	return true;
}

// upperCaseChecker - this function tests the password to make sure it has at least 1 upper case letter.
bool upperCaseChecker(string password)
{
	for (int i = 0; i < password.length(); i++)
	{
		if (isupper(password[i]))
		{
			return true;
		}
	}
	return false;
}

// lowerCaseChecker - this function tests the password to make sure it has at least 1 lower case letter.
bool lowerCaseChecker(string password)
{
	for (int i = 0; i < password.length(); i++)
	{
		if (islower(password[i]))
		{
			return true;
		}
	}
	return false;
}

// digitChecker - this function tests the password to make sure it has at least 1 digit.
bool digitChecker(string password)
{
	for (int i = 0; i < password.length(); i++)
	{
		if (isdigit(password[i]))
		{
			return true;
		}
	}
	return false;
}

// specialChecker - this function tests the password to make sure it has at least 1 special character.
bool specialChecker(string password)
{
	for (int i = 0; i < password.length(); i++)
	{
		if (!isalnum(password[i]) && isprint(password[i]))
		{
			return true;
		}
	}
	return false;
}

// getFullPath - prompts user for full path (eg C:\Folder\File.txt) and returns the entry as a string to where it was called.
string getFullPath(string& fullPath)
{
	cout << "Please enter filename: ";
	getline(cin, fullPath);
	return fullPath;
}

// openFileValidator - when given the full path of a file, will attempt to open the file and output whether it failed or not. 
void openFileValidator(string fileName)
{
	fstream inputFile;
	inputFile.open(fileName);
	if (inputFile)
	{
	}
	else
	{
		cout << "Error: " << fileName << " could not be opened. Exiting program." << endl;
		inputFile.close();
		exit(1);
	}
	inputFile.close();
}




