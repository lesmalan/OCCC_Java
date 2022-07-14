// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC6-23 Prime Number List

#include <iostream>
#include <cstdlib>
#include <fstream>
#include <string>

using namespace std;

//Function prototypes
bool isPrime(int);

int main() {

	// Program Headline
	cout << "PC6-23 Prime Number List\n";
	cout << "By Les Malan\n";
	cout << "2022\n";
	cout << "This program outputs a list of primes to a specified output file from a specified range of integers.\n";
	cout << "------------------\n";
	cout << "\n";

	ofstream outputFile;
	string filename;
	int firstValue, secondValue, lowerValue, higherValue;

	cout << "Please enter output file name and path: ";
	getline(cin, filename);

	outputFile.open(filename);

	if (outputFile) {
		cout << "File write successful!" << endl;
	}
	else {
		cout << "File write failed! Womp womp...";
		return 0;
	}

	cout << "Please enter first number in range: ";
	cin >> firstValue;

	cout << "Please enter last number in range: ";
	cin >> secondValue;

	if (firstValue <= secondValue) {
		lowerValue = firstValue, higherValue = secondValue;
	}
	if (secondValue < firstValue) {
		lowerValue = secondValue, higherValue = firstValue;
	}

	//cout << "lowerValue is " << lowerValue << ". higherValue is " << higherValue << endl;

	while (lowerValue <= higherValue) {
		if (isPrime(lowerValue)) {
			outputFile << lowerValue << endl;
			lowerValue++;
		}
		else if (!isPrime(lowerValue)) {
			lowerValue++;
		}
	}

	outputFile.close();

	cout << "Primes written to file " << filename;

	return 0;
}

//Function definitions

//Copied this function from (https://en.wikipedia.org/wiki/Primality_test#C#,_C++_&_C) I saw the example from the PowerPoint, but liked this one a bit better. 
bool isPrime(int n)
{
	if (n == 2 || n == 3)
		return true;

	if (n <= 1 || n % 2 == 0 || n % 3 == 0)
		return false;

	for (int i = 5; i * i <= n; i += 6)
	{
		if (n % i == 0 || n % (i + 2) == 0)
			return false;
	}

	return true;
}