package TreesAndGraphs.FirstCommonAncestor;

import TreesAndGraphs.BinaryTreeNode;

public class FirstCommonAncester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Solution 1: O(deep) time
	BinaryTreeNode commonAncestor (BinaryTreeNode p, BinaryTreeNode q){
		int delta = getDeep(p)-getDeep(q);
		BinaryTreeNode first = delta>0?q:p;
		BinaryTreeNode second = delta>0?p:q;
		second = goUp(second, Math.abs(delta));
		
		while (first!=second && first!=null && second != null){
			first = first.parent;
			second = second.parent;
		}
		
		return first==null || second == null? null:first;
	}
	
	BinaryTreeNode goUp(BinaryTreeNode n, int delta){
		while(delta>0 && n != null){
			n = n.parent;
			delta--;
		}
		return n;
	}
	
	int getDeep(BinaryTreeNode n){
		int deep = 0;
		while (n!=null){
			deep ++;
			n = n.parent;
		}
		return deep;
	}

}
