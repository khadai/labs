#include "iostream"
#include "Windows.h"

using namespace std;

const int I=5;
const int J=5;

class Matrix
{
public:
	void InputMatrix();
	void OutputMatrix();
	void SortColumns();	//by ascending
	int* SumInRows();
	double GeometricMidling(); 
private:
	int matrix[I][J];

};

void Matrix::SortColumns()
{
	for(int j = 0; j < J; j++)
	{
		

		for(int i = 0; i < I - 1; i++)
		{
			int minIndex = i;
			for(int tmp = i + 1; tmp < I; tmp++)
			{
				if(matrix[minIndex][j] > matrix[tmp][j])
				{
					minIndex = tmp;
				}
			}

			int swap = matrix[minIndex][j];
			matrix[minIndex][j] = matrix[i][j];
			matrix[i][j] = swap;
		}


	}
}

void Matrix::InputMatrix()
{
	for (int i = 0; i < I; i++, cout << endl)
	{
		for (int j = 0; j < J; j++)
		{
			cout << "input element[" << i+1 << "][" << j+1 << "] = ";
			cin >> matrix[i][j];
		}
	}
}

void Matrix::OutputMatrix()
{
	for (int i = 0; i < I; i++)
	{
		for (int j = 0; j < J; j++)
		{
			cout << "\t" << matrix[i][j];
		}
		cout << "\t" << endl;
	}
}

int* Matrix::SumInRows()
    {
        int t = 0;
		int* sumsOfRows = new int[I];

        for (int i = 0; i < I ; i++)
        {
            t = 0;
            for (int j = 0; j < J; j++)
                {
                        t = t + matrix[i][j];
                }
            sumsOfRows[i] = t;
        }

        return sumsOfRows;
    }

double Matrix::GeometricMidling()
{
  double productOfSums = 1;
  double geometric_midling = 1;
  int* p = SumInRows();

    for (int k = 0; k < J; k++)
    {
		productOfSums *= *p++;
    }

    geometric_midling = pow(abs(productOfSums), 1.0 / I);

    return geometric_midling;
}



void main()
{
	Matrix Blur;

	cout << "Input matrix:" <<endl;
	Blur.InputMatrix();

	cout << "Blured matrix:" <<endl;
	Blur.OutputMatrix();

	Blur.SortColumns();

	cout << "\nSorted matrix:" <<endl;
	Blur.OutputMatrix();

	    for (int i = 0; i < I; i++)
		{
			cout << "\nSum in row " << i + 1 << " is: " << Blur.SumInRows()[i] ;
		}
		cout << endl;

	cout << "\nGeometric average is: " << Blur.GeometricMidling() ;

	cout << endl;
	cout << endl;

		system("pause");
}
