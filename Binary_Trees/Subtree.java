public class Subtree {
    // Subtree of another tree
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    // check if two trees are identical or not

    public static boolean isIdentical(Node node, Node subRoot) {
        // it will be easy if we check for unidentical
        if (node == null && subRoot == null) {
            return true; // identical
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false; // if they are not identical
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false; // if they are not identical
        }
        // if any of these cases did not return false then
        return true;

    }

    public static boolean isSubtree(Node root, Node subRoot) { // true
        if(root == null){
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        boolean leftAns= isSubtree(root.left, subRoot); //if it exists in left subtree it wil  return true
        boolean rightAns= isSubtree(root.right, subRoot);
//we used or function as if anyone returns true then return final true
        return leftAns || rightAns;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }

}
