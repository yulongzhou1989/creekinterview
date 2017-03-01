package TreesAndGraphs;

public class CheckBalanced_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Method1
	int getHeight(BinaryTreeNode root){
		if (root == null) return -1; //empty tree, height equals to -1
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

	//balanced tree:
	// The left and right subtrees' heights differ by at most one, AND
	// The left subtree is balanced, AND
	// The right subtree is balanced
	boolean isBalanced(BinaryTreeNode root){
		if (root == null) return true;
		
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if (Math.abs(heightDiff)>1){
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}

	int getHeight1(BinaryTreeNode root){
		if (root == null) return -1;
		int leftHeight = getHeight1(root.left);
		int rightHeight = getHeight1(root.right);
		if (leftHeight == Integer.MIN_VALUE || rightHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if (Math.abs(leftHeight-rightHeight)>1)
			return Integer.MIN_VALUE;
		else 
			return Math.max(leftHeight, rightHeight) + 1;
	}
	
	//Method2 O(N) time, O(H) space
	boolean isBalanced1(BinaryTreeNode root){
		return getHeight1(root)!=Integer.MIN_VALUE;
	}
}
