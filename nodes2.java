import org.w3c.dom.Node;

public class nodes2 {
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
    
