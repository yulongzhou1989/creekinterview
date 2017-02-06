package LinkList;

import java.util.LinkedList;

import common.Node;

public class theKthToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static Node theKthToTheEnd (Node node, int k){
		return getTheKth(node, k, 0);
	}
	
	public static Node getTheKth(Node head,int k, int index){
		
		if (head.next != null){
			return null;
		}
		
		Node n = getTheKth(head, k, index);
		index ++;
		
		if (index == k){
			return head;
		}
		
		return n;
	}
	
	public static Node getNthNode (Node head, int k){
		
		Node head1 = head;
		Node head2 = head;
		/**
		 * Make head1 and head2 has K length distance
		 */
		for (int i=0; i<k; i++){
			if (head1 == null){
				return null;
			}
			head1 = head1.next;
		}
		
		/**
		 * let head1 touch end, then the head2 will have K distance from end
		 */
		while (head1 != null){
			head1 = head1.next;
			head2 = head2.next;
		}
		
		return head2;
	}
}
