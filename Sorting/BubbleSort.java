import java.util.*;
public class BubbleSort {

    public void Bubble(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void print(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] arr;
        System.out.println("Enter the size of an array :");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter the elements of an array :");

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        BubbleSort b = new BubbleSort();
        b.Bubble(arr);
        b.print(arr);

    }
}