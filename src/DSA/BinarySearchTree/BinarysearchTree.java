package DSA.BinarySearchTree;

public class BinarysearchTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BST class
    static class BST {
        Node root;

        public BST() {
            root = null;
        }

        // Insert a new value
        void insert(int value) {
            root = insertRec(root, value);
        }

        // Recursive insert helper
        Node insertRec(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            }

            if (value < root.data)
                root.left = insertRec(root.left, value);
            else if (value > root.data)
                root.right = insertRec(root.right, value);

            return root;
        }

        // Search for a value
        boolean search(Node root, int key) {
            if (root == null) {
                return false;
            }
            if (root.data == key) {
                return true;
            }
            return key < root.data
                    ? search(root.left, key)
                    : search(root.right, key);
        }

        // Traversals
        void preorder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        void deleteNode(int key) {
            deleteNodeH(root, key);
        }
        Node deleteNodeH(Node root, int key) {
            if (root == null) return root;

            if (key < root.data) {
                root.left = deleteNodeH(root.left, key);
            } else if (key > root.data) {
                root.right = deleteNodeH(root.right, key);
            } else {
                
                if (root.left == null && root.right == null) {
                    
                    return null;
                }
                if(root.left == null){
                    return root.right;
                }
                if(root.right == null){
                    return root.left;
                }
                else{
                    Node Is = findInorderSuccesser(root.left);
                    root.data = Is.data;
                    root.right = deleteNodeH(root.right,key);
                }
            }
            return root;
        }
        Node findInorderSuccesser(Node root){
            if(root.left == null){
                return root;
            }
            return findInorderSuccesser(root.left);
        }

        void inorder(Node root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        void postorder(Node root) {
            if (root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Main method
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        tree.deleteNode(40);
        tree.inorder(tree.root);

    }
}

