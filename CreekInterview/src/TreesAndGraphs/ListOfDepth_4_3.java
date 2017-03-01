package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepth_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//DFS
	public static void createLevelLinkedList(BinaryTreeNode root
			, ArrayList<LinkedList<BinaryTreeNode>> lists, int level){
		if (root == null) return;
		
		LinkedList<BinaryTreeNode> list = null;
		if (lists.size() == level){
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level+1);
		createLevelLinkedList(root.right, lists, level+1);
	}
	
	ArrayList<LinkedList<BinaryTreeNode>> createLevelLinkedListDFS(BinaryTreeNode root){
		ArrayList<LinkedList<BinaryTreeNode>> lists = new ArrayList<LinkedList<BinaryTreeNode>>();
		createLevelLinkedList(root,lists, 0);
		return lists;
	}

	//BFS
	ArrayList<LinkedList<BinaryTreeNode>> createLevelLinkedListBFS(BinaryTreeNode root){
		ArrayList<LinkedList<BinaryTreeNode>> result = new ArrayList<LinkedList<BinaryTreeNode>>();
		
		LinkedList<BinaryTreeNode> current = new LinkedList<BinaryTreeNode>();
		if (root!=null){
			current.add(root);
		}
		
		while (current.size()>0){
			result.add(current);//add previous level
			LinkedList<BinaryTreeNode> parents = current; // go to next level
			current = new LinkedList<BinaryTreeNode>();
			for (BinaryTreeNode n: parents){
				if (n.left!=null){
					current.add(n.left);
				}
				if (n.right!=null){
					current.add(n.right);
				}
			}
		}
		
		return result;
	}
}
