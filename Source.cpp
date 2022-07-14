// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC5-25 Student Line-Up From File

#include <iostream>
#include <string>
#include <fstream>


using namespace std;

int main() {

	// Program Headline
	cout << "PC5-25 Student Lineup from File\n";
	cout << "By Les Malan\n";
	cout << "2022\n";
	cout << "------------------\n";
	cout << "\n";

	ifstream inputFile;
	string fileName, fullName, close_to_A_Name = "zzzzzzzz", close_to_Z_Name = "aaaaaaaa";
	int iterations = 0, student_Count;

	cout << "Please enter filename: ";
	getline(cin, fileName);

	inputFile.open(fileName);

	if (inputFile)
	{
		cout << "File read successful.";
	}
	else
	{
		cout << "File open failed!";
		return 0;
	}

	cout << "\n";
	cout << "Please enter number of students in class: ";
	cin >> student_Count;

	while (iterations < student_Count)
	{
		getline(inputFile, fullName);
		if (fullName < close_to_A_Name)
		{
			close_to_A_Name.assign(fullName);
			iterations++;
		}
		if (fullName > close_to_Z_Name)
		{
			close_to_Z_Name.assign(fullName);
			iterations++;
		}
		else
		{
			iterations++;
		}
	}
	cout << close_to_A_Name << endl;
	cout << close_to_Z_Name << endl;


	inputFile.close();
	return 0;
}


