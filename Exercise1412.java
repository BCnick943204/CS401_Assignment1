package passantino_CS401_A1;

public class Exercise1412 {

	/* Uses a bare bones BST to store the values and print them in order
	 * 
	 * 
	 */
	public void getEqualValues(int[] a, int[] b) {
		BST bst = new BST();
		for(int i=0; i < a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j])
					bst.insertNode(new Node(a[i]));
			}
		}
		bst.printInOrder();
	}
	
	
	
	
	
	
	
	private class BST{
		Node root = null;
		
		public void insertNode(Node node) {
			if(root == null)
				root = node;
			insertNode(root, node);
		}
		private void insertNode(Node root, Node node) {
			if(root == null)
				return;
			else if(node.value < root.value) {
				if(root.getLeft() == null)
					root.setLeft(node);
				
				insertNode(root.getLeft(), node);
				
			}else if(node.value > root.value){
				if(root.getRight() == null)
				root.setRight(node);
				
				insertNode(root.getRight(), node);

			}
			}
			
		
		public void printInOrder() {
			printInOrder(root);
		}
		private void printInOrder(Node n) {
			if(n == null)
				return;
			printInOrder(n.getLeft());
			System.out.println(n.getValue());
			printInOrder(n.getRight());
		}
		
		
	}
	private class Node{
		int value;
		Node right;
		Node left;
		public Node(int value) {
			this.value = value;
			this.right = null;
			this.left = null;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		
		
	}
}
