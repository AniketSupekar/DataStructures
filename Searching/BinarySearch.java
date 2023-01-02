import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] , key , s , e , mid , size , flag = 0;

        System.out.println("Enter the size of array :");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter the elements of array :");
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
                System.out.println("Element is found");
                break;
            } else if (arr[mid]>key) {
                e = mid - 1;
            } else if (arr[mid]<key) {
                s = mid + 1; 
            }
        }
        if(flag==0) {
            System.out.println("Element is not present");
        }
    }
    
}
