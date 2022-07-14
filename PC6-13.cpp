// Les Malan
// OCCC Spring 2022
// Beginning Programming
// PC6-13 Days Out

#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

// Function prototypes
int employeeCount();
int daysAbsent(int);
double averager(int, int);
bool validator(int);

int main() {
	int employees = employeeCount();
	//cout << "Number of employees: " << employees << endl;
	int totalDaysAbsent = daysAbsent(employees);
	//cout << "Sum of all absences for employees: " << totalDaysAbsent << endl;
	double averageDaysOut = averager(employees, totalDaysAbsent);
	cout << "Average days out per employee: " << fixed << setprecision(2) << averageDaysOut;
	
	return 0;
}

// Function definitions
int employeeCount() {
	int employees = 0;
	cout << "Please enter number of employees: ";
	cin >> employees;
	while (!validator(employees)) {
		cout << "Invalid entry. Please re-enter number of employees: ";
		cin >> employees;
	}
	return employees;
}

int daysAbsent(int employees) {
	int n = 1;
	int a = 0;
	static int b = 0;
	while (n <= employees) {
		cout << "Please enter number of days absent for employee " << n << ": ";
		cin >> a;
		while (!validator(a)) {
			cout << "Invalid entry. Please re-enter number of days absent: ";
			cin >> a;
		}
		b += a;
		n++;
	}

	return b;
}

double averager(int employees, int totalDaysAbsent) {
	double a = employees;
	double b = totalDaysAbsent;
	return (b / a);
}

bool validator(int input) {
	if (input < 0) {
		return false;
	}
	else return true;
}


