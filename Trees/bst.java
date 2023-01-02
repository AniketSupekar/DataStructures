import java.util.Scanner;

public class bst {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int n) {
            data = n;
            left = null;
            right = null;
        }
    }

   public static class BST {
        Node root;
        BST() {
            root = null;
        }

        public void insert(Node root , int no) {

            if(root==null) {
                root = new Node(no);
            }
            else if(no < root.data) {
                insert(root.left, no);
            }
            else {
                if(no > root.data) {
                    insert(root.right, no);
                }
            }
        }

        void inorder(Node temp) {
            if(root!=null) {
                inorder(temp.left);
                System.out.println(temp.data);
                inorder(temp.right);
            }
        }

        void preorder(Node temp) {
            if(temp!=null) {
                System.out.println(temp.data);
                preorder(temp.left);
                preorder(temp.right);
            }
        }

        void postorder(Node temp) {
            if(temp!=null) {
                postorder(temp.left);
                postorder(temp.right);
                System.out.println(temp.data);
            }
        }

        void search(int key) {
            Node temp = root;
            int flag = 0;

            while(temp!=null) {
                if(temp.data == key) {
                    flag = 1;
                    break;
                }
                else {
                    if(temp.data > key) {
                        temp = temp.left;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }

            if(flag==1) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST b = new BST();
        int c;

        do {
            System.out.println("Press 1 for insert element");
            System.out.println("Press 2 for printing elements inorder manner ");
            System.out.println("Press 3 for printing elements preorder manner ");
            System.out.println("Press 2 for printing elements postorder manner ");
            System.out.println("Press 5 to search the element in BST");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 :
                b.insert(null, 1);
                b.insert(null, 8);
                b.insert(null, 9);
                b.insert(null, 10);
                b.insert(null, 11);
                break;

                case 2 :
                b.inorder(null);
                break;

                case 3 :
                b.preorder(null);
                break;

                case 4 :
                b.postorder(null);
                break;

                case 5 :
                b.search(5);
                break;

                default :
                System.out.println("Enter the valid choice");
            }
            System.out.println("Press 1 to continue , press 0 to exit");
            c = sc.nextInt();
        } while (c==1);
    }
}
