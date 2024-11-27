public class nodes {
    
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
