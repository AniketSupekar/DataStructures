// Accept array from user find key index if not matches then return the -1

#include<iostream>
using namespace std;
int BinarySearch(int array[],int n,int key)
{
    int s=0; // Starting element of array 
    int e=n; // End element of array
    while (s<=e)
    {
        int mid = (s+e)/2;

        if ( array[mid]==key ){
            return mid;
        }
        
        else if ( array[mid]>key ){
            e=mid-1;
        }
        else{ // ( array[mid]<key )
            s=mid+1;
        }
    }
    return -1;
}
int main()
{
    int n;
    cout << "Enter the size of array :";
    cin>>n;
    int array[n];
    cout<<"Enter the elements of array :";
    for ( int i=0; i<n; i++ )
    {
        cin>>array[i];
    }
    int key;
    cout<<"Enter the number to find index :";
    cin>>key;

    cout<<BinarySearch(array,n,key);
    return 0;
}