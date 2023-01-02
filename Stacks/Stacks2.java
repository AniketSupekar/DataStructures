import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

// Stacks using linked list

public class Stacks2 {
    
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {

        static Node head;

        public static boolean isEmpty() {
            return head==null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void pop() {
            if(isEmpty()) {
                System.out.println("The list is empty");
            }

            int top = head.data;
            System.out.println("The element removed is "+top);
            head=head.next;
        }

        public void display() {
            Node temp = head;
            while(temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        Scanner x = new Scanner(System.in);
        int c;
        do{
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for display");
            int a = x.nextInt();
            switch(a) {
                case 1 :
                System.out.println("Enter the element in stack :");
                int b = x.nextInt();
                s.push(b);
                break;

                case 2 :
                s.pop();
                break;

                case 3 :
                s.display();
                break;

                default :
                System.out.println("Please enter the valid choice");
            }
            System.out.println("Press 1 to continue");
            System.out.println("Press 0 to exit");
            c = x.nextInt();
        }
            while(c!=0);
        }
    }
