// Accept the array from user and also accept key value if the key value matches with array then written the index if not then return the -1

#include <iostream>
using namespace std;
int LinearSearch(int array[], int n, int key)
{
    for (int i = 0; i < n; i++)
    {
        if (key == array[i])
        {
            return i;
        }
    }
    return -1;
}
int main()
{
    int n;
    cout << "Enter the size of array :";
    cin >> n;

    int array[n];
    cout<<"Enter the elements of array :";
    for (int i = 0; i < n; i++)
    {
        cin >> array[i];
    }

    int key;
    cout << "Enter the value to find the index :";
    cin >> key;

    cout<<"The index of given value is :";
    cout << LinearSearch(array, n, key);

    return EXIT_SUCCESS;
}


