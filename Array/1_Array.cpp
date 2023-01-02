// Accept an aray from user and find the maximum and minimum number from accepted array

#include <iostream>
#include<climits>
using namespace std;

int main()
{
    int n;
    
    cin>>n;

    int array[n];

    for (int i=0;i<n;i++)
    {
        cin>>array[i];
    }

    int maxNo=INT_MIN;
    int minNo=INT_MAX;

    for (int i=0; i<n; i++)
    {
        maxNo=max(maxNo,array[i]);
        minNo=min(minNo,array[i]);
    }

    cout<<maxNo<<" "<<minNo;

    
}


// The same logic but just by using if condition for calculating the highest and lowest value in array

/*

#include <iostream>
#include<climits>
using namespace std;

int main()
{
    int n;
    
    cin>>n;

    int array[n];

    for (int i=0;i<n;i++)
    {
        cin>>array[i];
    }

    int maxNo=INT_MIN;
    int minNo=INT_MAX;

    for (int i=0; i<n; i++)
    {
        if (array[i]>maxNo)   Here we used if condition insted of max and min functions
        {
            maxNo=array[i];
        }

        if (array[i]<minNo)
        {
            minNo=array[i];
        }
        
    }

    cout<<maxNo<<" "<<minNo;
} 