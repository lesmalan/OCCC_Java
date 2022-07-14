// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC6-11 Lowest Score Drop

#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

// Function prototypes
void getScore(double &);
bool inputValidation(double, double, double);
void calcAverage(double, double, double, double, double);
double findLowest(double, double, double, double, double);

int main() {
	// Declare and initialive test variables
	double test1 = 0, test2 = 0, test3 = 0, test4 = 0, test5 = 0;

	// Call getScore 5 times, save output of each run as the value of relevant variable
	getScore(test1);
	getScore(test2);
	getScore(test3);
	getScore(test4);
	getScore(test5);
	
	// Call calcAverage, which adds the 5 scores together, then subtracts the value returned by the lowestScore function, and divides by 4
	calcAverage(test1, test2, test3, test4, test5);

	return 0;
}

// Function definitions

// getScore prompt for input, calls inputValidation function to check, then saves value and returns to main
void getScore(double &testScore)
{
	cout << "Please enter a test score: ";
	cin >> testScore;
	// Input validation will re-prompt for input if outside range 0-100. This returns the input to main, which is saved as test1 through test5
	while (!inputValidation(testScore, 0, 100)) {
		cout << "Invalid entry. Please re-enter test score: ";
		cin >> testScore;
	}
}


// Input validation function, returns a boolean value to getScore, which will reprompt if return value == false.
bool inputValidation(double testScore, double min, double max)
{
	if (testScore < min || testScore > max) {
		return false;
	}
	else 
		return true;
}

// Average calculator. Note that it subtracts the result from findLowest function, and divides by FOUR not five. Also handles output, since it's a void function
void calcAverage(double test1, double test2, double test3, double test4, double test5)
{
	double testAverage;
	double lowestScore;
	lowestScore = findLowest(test1, test2, test3, test4, test5);
	testAverage = (test1 + test2 + test3 + test4 + test5 - lowestScore)/4;
	cout << "Test Average (less lowest score): " << fixed << setprecision (2) << testAverage;
}

// Simple comparison function. Returns value to calcAverage function.
double findLowest(double test1, double test2, double test3, double test4, double test5)
{
	double lowest=test1;

	if (test2 < lowest) {
		lowest = test2;
	}
	if (test3 < lowest) {
		lowest = test3;
	}
	if (test4 < lowest) {
		lowest = test4;
	}
	if (test5 < lowest) {
		lowest = test5;
	}
	return lowest;
}
