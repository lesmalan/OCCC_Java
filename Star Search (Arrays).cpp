// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC7-1 Star Search (w/Arrays)

// Change const int ARR_SIZE to adjust number of scores desired. Sorry if there is too much documentation. 

#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

// Function prototypes
void getScore(double &);
bool inputValidation(double, double, double);
double getSmallest(double [], int);
void displayAverage(double);
void printArray(double[], int);
double averageCalculator(double[], int);
double getLargest(double[], int);


int main() {
	// Declare array
	// Change const int ARR_SIZE to adjust number of scores desired.
	const int ARR_SIZE = 9;
	double theScores[ARR_SIZE], averageScore;

	// Populate array
	for (int n = 0; n <= ARR_SIZE - 1; n++) {
		getScore(theScores[n]);
	}

	// Call average score calculator function
	averageScore = averageCalculator(theScores, ARR_SIZE);

	// Call display average score function
	displayAverage(averageScore);

	// Print array
	printArray(theScores, ARR_SIZE);

	return 0;
}

// Function definitions

// getScore - Input function with validation. Change min-max score validation here.
void getScore(double & contestantScore) {
	cout << "Please enter a contestant score: ";
	cin >> contestantScore;
	// Input validation will re-prompt for input if outside range specified below.
	while (!inputValidation(contestantScore, 0, 100)) {
		cout << "Invalid entry. Please re-enter contestant score: ";
		cin >> contestantScore;
	}
}

// inPutValidation - compares a score to the min and max values. Returns true if between min and max, and false if outside.
bool inputValidation(double score, double min, double max) {
	if (score < min || score > max) {
		return false;
	}
	else
		return true;
}

// getSmallest - Returns smallest value from given array and size.
double getSmallest(double arr[], int numScores){
	double smallest;
	smallest = arr[0];
	for (int i = 0; i < numScores; i++) {
		if (smallest > arr[i]) {
			smallest = arr[i];
		}
	}
	return smallest;
}

// getLargest - Returns largest value from given array and size.
double getLargest(double arr[], int numScores) {
	double largest;
	largest = arr[0];
	for (int i = 0; i < numScores; i++) {
		if (largest < arr[i]) {
			largest = arr[i];
		}
	}
	return largest;
}

// displayAverage - Simple output function for a given score value.
void displayAverage(double score) {
	cout << "The average of all scores excluding the lowest and highest is " << fixed << setprecision(2) << score << "." << endl;
}

// printArray - A simple output function to print all terms in an array of a given size.
void printArray(double arr[], int numScores) {
	for (int i = 0; i <= numScores - 1; i++) {
		cout << "Score " << i + 1 << " is " << arr[i] << "." << endl;
	}
}

// averageCalculator - finds highest and lowest value of given array of specified size. Finds the average of the array, less the highest and lowest value. Returns this average.
double averageCalculator(double arr[], int numScores) {
	double total = 0, lowest, highest, average;
	for (int j = 0; j <= numScores - 1; j++) {
		total += arr[j];
	}
	lowest = getSmallest(arr, numScores);
	highest = getLargest(arr, numScores);
	average = (total - lowest - highest) / (numScores - 2);
	return average;
}



