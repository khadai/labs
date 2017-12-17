#include "iostream"
#include "Windows.h"

using namespace std;

const int ROW = 5;
const int COLUMN = 5;

class Matrix
{
public:
    void InputMatrix();
    void OutputMatrix();
    void SortColumnsByInsertion();    //by ascending
    int* SumInRows();
    double GeometricMidling();
private:
    int matrix[ROW][COLUMN];

};

void Matrix::SortColumnsByInsertion()
{
    for(int counterColumn = 0; counterColumn < COLUMN; counterColumn++)
    {
        

        for(int counterRows = 0; counterRows < ROW - 1; counterRows++)
        {
            int minIndex = counterRows;
            for(int tmp = counterRows + 1; tmp < ROW; tmp++)
            {
                if(matrix[minIndex][counterColumn] > matrix[tmp][counterColumn])
                {
                    minIndex = tmp;
                }
            }

            int swap = matrix[minIndex][counterColumn];
            matrix[minIndex][counterColumn] = matrix[counterRows][counterColumn];
            matrix[counterRows][counterColumn] = swap;
        }


    }
}

void Matrix::InputMatrix()
{
    for (int counterRows = 0; counterRows < ROW; counterRows++, cout << endl)
    {
        for (int counterColumn = 0; counterColumn < COLUMN; counterColumn++)
        {
            cout << "input element[" << counterRows + 1 << "][" << counterColumn+1 << "] = ";
            cin >> matrix[counterRows][counterColumn];
        }
    }
}

void Matrix::OutputMatrix()
{
    for (int counterRows = 0; counterRows < ROW; counterRows++)
    {
        for (int counterColumn = 0; counterColumn < COLUMN; counterColumn++)
        {
            cout << "\t" << matrix[counterRows][counterColumn];
        }
        cout << "\t" << endl;
    }
}

int* Matrix::SumInRows()
    {
        int sum = 0;
        int* sumsOfRows = new int[ROW];

        for (int counterRows = 0; counterRows < ROW ; counterRows++)
        {
            sum = 0;
            for (int counterColumn = 0; counterColumn < COLUMN; counterColumn++)
                {
                        sum = sum + matrix[counterRows][counterColumn];
                }
            sumsOfRows[counterRows] = sum;
        }

        return sumsOfRows;
    }

double Matrix::GeometricMidling()
{
  double productOfSums = 1;
  double geometric_midling = 1;
  int* pSumInRows = SumInRows();

    for (int counterComumn = 0; counterComumn < COLUMN; counterComumn++)
    {
        productOfSums *= *pSumInRows++;
    }

    geometric_midling = pow(abs(productOfSums), 1.0 / ROW);

    return geometric_midling;
}



void main()
{
    Matrix Blur;

    cout << "Input matrix:" <<endl;
    Blur.InputMatrix();

    cout << "Inputed matrix:" <<endl;
    Blur.OutputMatrix();

    Blur.SortColumnsByInsertion();

    cout << "\nSorted matrix:" <<endl;
    Blur.OutputMatrix();

        for (int counterRows = 0; counterRows < ROW; counterRows++)
        {
            cout << "\nSum in row " << counterRows + 1 << " is: " << Blur.SumInRows()[counterRows] ;
        }
        cout << endl;

    cout << "\nGeometric average is: " << Blur.GeometricMidling() ;

    cout << endl;
    cout << endl;

        system("pause");
}

