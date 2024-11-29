import org.w3c.dom.Node;

public class NodeString{
    public static void main(String[] args) {
        // Create the root node
        Node root = new Node("root", 10);

        // Insert child nodes
        root.left = new Node("left", 5);
        root.right = new Node("right", 15);
        root.left.left = new Node("left-left", 3);
        root.left.right = new Node("left-right", 7);
        root.right.left = new Node("right-left", 12);
        root.right.right = new Node("right-right", 18);

        // Dump the tree to a string and print
        System.out.println("Tree Dump:");
        System.out.println(root.dumpToString(0));
    }
}