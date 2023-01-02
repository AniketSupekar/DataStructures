import java.util.Scanner;

// Queue using arrylist

public class Queue1 {

    static class Queue {
        
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n)
        {
            arr = new int[n];
            size = n;
            front = 0;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Enqueue - o(1)
        public void add(int data) {
            if(rear==size-1)
            {
                System.out.println("Queue is full !");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue - o(n)
        public void remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
            }

            int a = arr[front];
            System.out.println("Deleted number is "+a);
            front++;
        }

        // Peek - o(n)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

        public void display() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                for(int i=front; i<=rear; i++) {
                    System.out.println(arr[i]);
                }
            }
         }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("Press 1 for Enqueue");
            System.out.println("Press 2 for Dequeue");
            System.out.println("Press 3 for Display");

            int choice = sc.nextInt();

            switch(choice) {
                case 1 :
                System.out.println("Enter how many elements do you want to add");
                int b = sc.nextInt();
                System.out.println("Enter the elements in queue");
                for(int i=0;i<b;i++) {
                    q.add(sc.nextInt());
                }
                break;

                case 2 :
                q.remove();
                break;

                case 3 :
                q.display();
                break;

                default :
                System.out.println("Please enter the valid choice");
                break;
            }
            System.out.println("Press 1 to continue");
            System.out.println("Press 0 to exit");
            c = sc.nextInt();
        } while (c==1);
    }
}
