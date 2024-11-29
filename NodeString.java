import org.w3c.dom.Node;

static class Node {
    private String nodeId; // Unique identifier for the node
    private int data;      // Integer data stored in the node
    private Node left;     // Left child node
    private Node right;    // Right child node

    // Constructor
    public Node(String nodeId, int data) {
        this.nodeId = nodeId;
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public String dumpToString(int depth) {
        StringBuilder sb = new StringBuilder();
        // Add tabs based on the depth
        sb.append("\t".repeat(depth));
        // Add node ID and data
        sb.append("Node{ID='").append(nodeId).append("', Data=").append(data).append("}\n");
        // Dump the left and right children
        if (left != null) {
            sb.append(left.dumpToString(depth + 1));
        }
        if (right != null) {
            sb.append(right.dumpToString(depth + 1));
        }
        return sb.toString();
    }
}
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