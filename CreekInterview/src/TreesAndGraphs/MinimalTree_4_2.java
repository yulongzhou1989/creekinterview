package TreesAndGraphs;

public class MinimalTree_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	BinaryTreeNode createMinimalBST(int [] arr){
		return createMinimalBST(arr, 0, arr.length-1);
	}
	
	BinaryTreeNode createMinimalBST(int [] arr, int start, int end){
		if (end<start){
			return null;
		}
		int mid = (start+end)/2;
		BinaryTreeNode btn = new BinaryTreeNode (arr[mid]);
		btn.left = createMinimalBST(arr, start, mid);
		btn.right = createMinimalBST(arr, mid, end);
		return btn;
	}
	
}
