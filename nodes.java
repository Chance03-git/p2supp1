public class nodes {
    static class Node {
        private String nodeId; // Unique identifier for the node
        private int data;      // Integer data stored in the node
        private Node left;     // Left child of the node
        private Node right;    // Right child of the node

        /**
         * Constructor to initialize a Node with a unique ID and data.
         * @param nodeId Unique identifier for the node.
         * @param data Integer value to store in the node.
         */
        public Node(String nodeId, int data) {
            this.nodeId = nodeId;
            this.data = data;
            this.left = null;
            this.right = null;
        }

        /**
         * Returns the ID of the node.
         * @return Node ID.
         */
        public String getNodeId() {
            return nodeId;
        }

        /**
         * Returns the data stored in the node.
         * @return Integer data.
         */
        public int getData() {
            return data;
        }

        /**
         * Returns the left child of the node.
         * @return Left child (Node) or null if not set.
         */
        public Node getLeft() {
            return left;
        }

        /**
         * Returns the right child of the node.
         * @return Right child (Node) or null if not set.
         */
        public Node getRight() {
            return right;
        }

        /**
         * Sets the left child of the node.
         * @param left Node to set as the left child.
         */
        public void setLeft(Node left) {
            this.left = left;
        }

        /**
         * Sets the right child of the node.
         * @param right Node to set as the right child.
         */
        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{ID='" + nodeId + "', Data=" + data + "}";
        }
    }

public static void main(String[] args) {
    // Create the root node
    Node root = new Node("root", 10);

    // Create child nodes
    Node leftChild = new Node("left", 5);
    Node rightChild = new Node("right", 15);

    // Set children
    root.setLeft(leftChild);
    root.setRight(rightChild);

    // Print the nodes
    System.out.println("Root Node: " + root);
    System.out.println("Left Child: " + root.getLeft());
    System.out.println("Right Child: " + root.getRight());

    // Assertions for testing
    assert root.getData() == 10 : "Test failed: Root data mismatch.";
    assert root.getLeft() == leftChild : "Test failed: Left child mismatch.";
    assert root.getRight() == rightChild : "Test failed: Right child mismatch.";
    assert root.getLeft().getData() == 5 : "Test failed: Left child data mismatch.";
    assert root.getRight().getData() == 15 : "Test failed: Right child data mismatch.";

    System.out.println("All tests passed successfully!");
}
}
