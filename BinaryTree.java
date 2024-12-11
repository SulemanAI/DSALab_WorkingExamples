
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    void printPreorder(Node node) {
        if (node == null)
            return;
        
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.printPreorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.printInorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.printPostorder(tree.root);

        System.out.println("\nRoot node: " + tree.root.key);
        System.out.println("Left child of root: " + tree.root.left.key);
        System.out.println("Right child of root: " + tree.root.right.key);
    }
}