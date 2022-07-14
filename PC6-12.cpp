// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC6-11 Star Search

#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

// Function prototypes
void getScore(double&, double, double);
bool inputValidation(double, double, double);
void calcAverage(double, double, double, double, double);
double findLowest(double, double, double, double, double);
double findHighest(double, double, double, double, double);

int main() {
	// Declare and initialize contestant variables
	double contestant1 = 0, contestant2 = 0, contestant3 = 0, contestant4 = 0, contestant5 = 0, validMin = 0, validMax = 10;

	// Call getScore 5 times, save output of each run as the value of relevant variable
	getScore(contestant1, validMin, validMax);
	getScore(contestant2, validMin, validMax);
	getScore(contestant3, validMin, validMax);
	getScore(contestant4, validMin, validMax);
	getScore(contestant5, validMin, validMax);

	// Call calcAverage, which adds the 5 scores together, then subtracts the value returned by the lowestScore function and highestScore function, and divides by 3
	calcAverage(contestant1, contestant2, contestant3, contestant4, contestant5);

	return 0;
}

// Function definitions

// getScore prompt for input, calls inputValidation function to check, then saves value and returns to main
void getScore(double& contestantScore, double min, double max)
{
	cout << "Please enter a contestant score: ";
	cin >> contestantScore;
	// Input validation will re-prompt for input if outside range 0-10. This returns the input to main, which is saved as contestant1 through contestant5
	while (!inputValidation(contestantScore, min, max)) {
		cout << "Invalid entry. Please re-enter contestant score: ";
		cin >> contestantScore;
	}
}


// Input validation function, returns a boolean value to getScore, which will reprompt if return value == false.
bool inputValidation(double contestantScore, double min, double max)
{
	if (contestantScore < min || contestantScore > max) {
		return false;
	}
	else
		return true;
}

// Average calculator. Note that it subtracts the result from findLowest function and findHighest, and divides by THREE not five. Also handles output, since it's a void function.
void calcAverage(double contestant1, double contestant2, double contestant3, double contestant4, double contestant5)
{
	double contestantAverage;
	double lowestScore, highestScore;
	lowestScore = findLowest(contestant1, contestant2, contestant3, contestant4, contestant5);
	highestScore = findHighest(contestant1, contestant2, contestant3, contestant4, contestant5);
	contestantAverage = (contestant1 + contestant2 + contestant3 + contestant4 + contestant5 - lowestScore - highestScore) / 3;
	cout << "Contestant Average (less lowest/highest score): " << fixed << setprecision(2) << contestantAverage;
}

// Simple comparison function. Returns value to calcAverage function.
double findLowest(double contestant1, double contestant2, double contestant3, double contestant4, double contestant5)
{
	double lowest = contestant1;

	if (contestant2 < lowest) {
		lowest = contestant2;
	}
	if (contestant3 < lowest) {
		lowest = contestant3;
	}
	if (contestant4 < lowest) {
		lowest = contestant4;
	}
	if (contestant5 < lowest) {
		lowest = contestant5;
	}
	return lowest;
}

// Simple comparison function. Returns value to calcAverage function.
double findHighest(double contestant1, double contestant2, double contestant3, double contestant4, double contestant5)
{
	double highest = contestant1;

	if (contestant2 > highest) {
		highest = contestant2;
	}
	if (contestant3 > highest) {
		highest = contestant3;
	}
	if (contestant4 > highest) {
		highest = contestant4;
	}
	if (contestant5 > highest) {
		highest = contestant5;
	}
	return highest;
}