// Assignment 1 : BinarySearch
// Name : Nikhil Kulkarni
// PRN : 22110033
// Roll No : 313032
// Date : 22-8-2023

import java.util.Scanner;

class Binary {

    public int BinarySearch() {
        Scanner sc = new Scanner(System.in);
        int arr[], key, s , e , mid , size , flag = 0;
        System.out.print("Enter the size of array :");
        size = sc.nextInt();
        arr = new int[size];

        System.out.print("Enter elements of array :");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched :");
        key = sc.nextInt();
        s = 0;
        e = size-1;

        while(s<=e) {
            mid = (s+e)/2;
            if(arr[mid]==key) {
                System.out.println("Element is found ! 😃 ");
                System.out.println();
                flag = 1;
                break;
            } else if(arr[mid]>key) {
                e = mid-1;
            } else if(arr[mid]<key) {
                s = mid + 1;
            }
        }
        if(flag==0) {
            System.out.println("Element is not found ! 🥹");
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]) {
        Binary b = new Binary();
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            b.BinarySearch();
            System.out.println("Press 1 to re-perform 🤔");
            System.out.println("Press 0 to exit ❌");
            c = sc.nextInt();
        } while(c==1);
    }
}
