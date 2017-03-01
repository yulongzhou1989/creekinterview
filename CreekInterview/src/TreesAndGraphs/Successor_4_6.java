package TreesAndGraphs;

public class Successor_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//if has right node, then it should return the left most node, 
	//if doesn't have right node, go search parent, until this node is the left node of its parent,
	//if node equals to null, return null
	BinaryTreeNode inorderSuccessor(BinaryTreeNode n){
		if (n == null) return null;
		
		if (n.right !=null){
			return leftMostNode(n.right);
		} else {
			BinaryTreeNode x = n;
			n = n.parent;
			while (n!=null && x!=n.left){
				x = n;
				n = n.parent;
			}
			return n;
		}
	}
	
	BinaryTreeNode leftMostNode(BinaryTreeNode n){
		while(n.left!=null){
			n = n.left;
		}
		return n;
	}
}
