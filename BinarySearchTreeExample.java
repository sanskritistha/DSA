package tree;

class BSTNode {

    int data;
    BSTNode left, right;

    BSTNode(int data) {
        this.data = data;
    }
}

class BST {

    BSTNode root;

    public BSTNode Search(BSTNode root, int key) {
        if (root == null) {
            return null;
        } else if (key < root.data) {
            return Search(root.left, key);

        } else {
            return Search(root.right, key);
        }

    }

    public BSTNode insert(BSTNode node, int data) {
        if (node == null) {
            node = new BSTNode(data);
        } else if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;

    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public void preorder(BSTNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public void preorder() {
        preorder(root);
    }

    public void inorder(BSTNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");

        inorder(root.right);

    }

    public void inorder() {
        inorder(root);
    }

    public void postorder(BSTNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public void postorder() {
        postorder(root);
    }
}

public class BinarySearchTreeExample {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.inorder();
        bst.preorder();
        bst.postorder();

    }

}
