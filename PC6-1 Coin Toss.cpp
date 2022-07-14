// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC6-8 Coin Toss

#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;


// Constants
const int min_Value = 0;
const int max_Value = 1;

// Variables
int coin, number_Of_Tosses, counter = 0, heads = 0, tails = 0;

// Get the unique system time
unsigned seed = time(0);

void coin_Toss()
{
	coin = (rand() % (max_Value - min_Value + 1)) + min_Value;
}
int main() {

	// Seed the random number generator
	srand(seed);

	cout << "Please enter number of coin tosses: ";
	cin >> number_Of_Tosses;

	cout << "Flipping the coin... " << endl;

	while (counter < number_Of_Tosses)
	{
		coin_Toss();
		if (coin == 0)
		{
			cout << "HEADS!" << endl;
			counter++;
			heads++;
		}
		if (coin == 1)
		{
			cout << "TAILS!" << endl;
			counter++;
			tails++;
		}
	}

	cout << "Number of heads: " << heads << endl;
	cout << "Number of tails: " << tails << endl;

	return 0;
}