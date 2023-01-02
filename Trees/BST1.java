import java.security.Key;

public class BST1 {

    public static Node root;

        static class Node {
            int data;
            Node left;
            Node right;
    
            Node(int val) {
                this.data = val;
            }
        }
    
        public static Node insert(Node root , int val) {
            if(root==null) {
                root = new Node(val);
                return root;
            }
    
            if(root.data > val) {
                root.left = insert(root.left, val);
            }
            else {
                root.right = insert(root.right, val);
            }
            return root;
        }
    
        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" " );
            inorder(root.right);
        }

        public static void preorder(Node temp) {
            if(temp!=null) {
                System.out.print(temp.data+" ");
                preorder(temp.left);
                preorder(temp.right);
            }
        }

        public static void postorder(Node temp) {
            if(temp!=null) {
                postorder(temp.left);
                postorder(temp.right);
                System.out.print(temp.data+" ");
            }
        }
    
        public static void search(int key) {
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
    
        public static void main(String[] args) {
            int values[] = {8,5,3,1,4,6,10,11,14};
            Node root = null;
    
            for(int i=0; i<values.length; i++) {
                root = insert(root, values[i]);
            }
            System.out.print("Inorder Traversal :");
            inorder(root);
            System.out.println();

            System.out.print("Preorder Traversal :");
            preorder(root);
            System.out.println();

            System.out.print("Postorder Traversal :");
            postorder(root);
            System.out.println();
            search(7);
            search(4);
        }
    }
    
    
