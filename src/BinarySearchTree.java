class Node {
	int key;
	Node parent, left, right;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}

public class BinarySearchTree {
	Node root;

	public void insert(int key) {
		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (key < x.getKey()) {
				x = x.getLeft();
			} else {
				x = x.getRight();
			}
		}
		Node z = new Node();
		z.setKey(key);
		if (y == null) {
			root = z;
		} else if (key < y.getKey()) {
			y.setLeft(z);
		} else {
			y.setRight(z);
		}
	}

	/* method to print the BST in inorder walk */
	public void print_inorder() {
		print_inorder(root);
	}

	private void print_inorder(Node node) {
		if (node != null) {
			print_inorder(node.getLeft());
			System.out.print(node.key + ", ");
			print_inorder(node.getRight());
		}
	}

	/* driver stub */
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(7);
		bst.insert(9);
		bst.insert(1);
		bst.insert(4);
		bst.insert(11);
		bst.print_inorder();
	}
}
