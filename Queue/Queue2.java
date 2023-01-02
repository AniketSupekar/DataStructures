import java.util.Scanner;
// Implementing queues using linked lists
public class Queue2 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {

        static Node front;
        static Node rear;

        public static boolean isEmpty() {
            return front==null && rear==null;
        }

        public void Enqueue(int data) {
            Node newNode = new Node(data);
            if(front==null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public int Dequeue() {
            if(isEmpty()) {
                return -1;
            }
            int result = front.data;
            front=front.next;
            return result;
        }

        public void Display() {
            Node temp = front;
            while(temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("Press 1 for enqueue");
            System.out.println("Press 2 for dequeue");
            System.out.println("Press 3 for display queue");
            int choice = sc.nextInt();
            switch(choice) {
                case 1 :
                System.out.println("Enter the element in stack");
                q.Enqueue(sc.nextInt());
                break;

                case 2 :
                q.Dequeue();
                break;

                case 3 :
                q.Display();
                break;

                default :
                System.out.println("Please enter the valid choice");
                break;
            }
            System.out.println("Press 1 to continue , press 0 to exit");
            c = sc.nextInt();
        } while (c==1);
    }

}
