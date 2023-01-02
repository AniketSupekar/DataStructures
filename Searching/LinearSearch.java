import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , key , c=0;
        int[] a;
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        a = new int[n];
        
        System.out.println("Enter the elements for array :");
        for(int i=0; i<n;i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the item to find :");
        key = sc.nextInt();

        for(int i=0;i<a.length;i++) {
            if(key==a[i]) {
                c++;
                break;
            }  
        }

        if(c>0) {
            System.out.println("Key is found");
        } else {
            System.out.println("Not found");
        }
    }
}
