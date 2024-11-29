import org.w3c.dom.Node;

public class nodes2 {
    static class Node {
        private int data;      // Integer data stored in the node
        private Node left;     // Left child node
        private Node right;    // Right child node

        // Constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public void insert(int newData) {
            if (newData < this.data) {
                // Insert into the left child
                if (this.left == null) {
                    this.left = new Node(newData);
                } else {
                    this.left.insert(newData);
                }
            } else {
                // Insert into the right child
                if (this.right == null) {
                    this.right = new Node(newData);
                } else {
                    this.right.insert(newData);
                }
            }
        }

        /**
         * Traverses the tree in-order (left, root, right) and prints the data.
         */
        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.print(data + " ");
            if (right != null) {
                right.printInOrder();
            }
        }
    }
    // Main method to test the implementation
    public static void main(String[] args) {
        // Create the root node
        Node root = new Node(10);

        // Insert data into the binary tree
        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);
        root.insert(12);
        root.insert(18);

        // Print the tree in order
        System.out.println("In-order traversal of the binary tree:");
        root.printInOrder();
    }
}
    
