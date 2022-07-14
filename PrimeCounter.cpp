// Les Malan
// OCCC Spring 2022
// Beginning Programming
// Prime Counter

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
	cout << "This program counts primes from big list of integers.\n";
	cout << "------------------\n";
	cout << "\n";

	ifstream inputFile;
	string fileName;
	int testValue, lineCounter = 1, primeCounter = 0;

	// This section requests file name and path, and validates
	cout << "Please enter filename: ";
	getline(cin, fileName);
	inputFile.open(fileName);
	if (inputFile){
		cout << "File read successful." << endl;
	}
	else{
		cout << "File open failed!" << endl;
		return 0;
	}

	// Pull value from file, test for primeness, ++ counts accordingly
	while (lineCounter <= 100000) {
		inputFile >> testValue;
		if (isPrime(testValue)) {
			primeCounter++;
			lineCounter++;
		}
		if (!isPrime(testValue)) {
			lineCounter++;
		}
	}

	cout << "primeCounter is " << primeCounter << endl;
	cout << "lineCounter is " << lineCounter << endl;
	cout << "Last value in list is " << testValue << endl;

	// Close input file and validate
	inputFile.close();
	cout << "File closed.";

	return 0;
}

//Function definitions

//Copied this function from PowerPoint
bool isPrime(int n) {
	bool result = true;
	if (n < 2) {
		result = false;
	}
	else {
		int start = 2;
		int stop = sqrt(n);
		for (int d = start; d <= stop; d++) {
			if (n % d == 0) {
				result = false;
				break;
			}
		}
	}
	return result;
}
