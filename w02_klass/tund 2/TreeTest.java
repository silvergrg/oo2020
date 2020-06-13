/**
 * TreeTest
 */
public class TreeTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(0);
        System.out.println(tree.root.getDATA());
        tree.root.left = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        System.out.println(tree.root.left.left.getDATA());
    }
}