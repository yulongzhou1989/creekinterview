package LinkList;

import common.Node;

public class Palindrome2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean judgePalindrome(Node head){
		
		return true;
	}
	
	public static Node reverse(Node node){
		Node head = null;
		
		while (node != null){
			Node n = new Node (node.data);
			n.next = head;
			head = n;
			node = node.next;
		}
		
		return head;
	}
	
	public static boolean judge1 (Node head){
		Node reverseNode = reverse(head);
		while (head!=null){
			if (head.data != reverseNode.data){
				return false;
			}
			head = head.next;
			reverseNode = reverseNode.next;
		}
		
		return true;
	}
	
	//public static boolean 

}
