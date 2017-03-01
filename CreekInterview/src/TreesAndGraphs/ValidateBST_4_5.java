package TreesAndGraphs;

public class ValidateBST_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Method 1
	Integer last_printed = null;
	
	boolean checkBST(BinaryTreeNode root){
		if (root == null) return true;
		
		//check left
		if (!checkBST(root.left)) return false;
		//check current
		if (last_printed != null && root.value<=last_printed){
			return false;
		}
		last_printed = root.value;
		//check right
		if (!checkBST(root.left)) return false;
		return true;
	}
	
	//Method 2: o(N) time, o(log N) space
	boolean checkBST1(BinaryTreeNode root){
		return checkBST1(root, null, null);
	}
	
	boolean checkBST1(BinaryTreeNode root, Integer max, Integer min){
		if (root == null) return true;
		
		if ((min!=null && root.value<=min) || (max!=null && root.value>max)){
			return false;
		} else if (!checkBST1(root.left, root.value, min) || !checkBST1(root.right, max, root.value)) {
			return false;
		}
		return true;
	}
	
}
