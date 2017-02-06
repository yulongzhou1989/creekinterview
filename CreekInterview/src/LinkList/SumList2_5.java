package LinkList;

import common.Node;

public class SumList2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node getSumList(Node head1, Node head2){
		
		Node head = getSum(head1, head2, 0);
		return head;
	}

	public static Node getSum(Node head1, Node head2, int carry){
		if (head1 == null && head2 == null && carry == 0){
			return null;
		}
		
		Node head = new Node(0);
		
		int sum = carry;
		
		if (head1!=null){
			sum+= head1.data;
		}
		
		if (head2!=null){
			sum+= head2.data;
		}
		
		head.data = sum%10;
		
		if (head1 != null || head2 != null){
			Node more = getSum( head1 == null? null:head1.next,
					head2==null? null:head2.next,
					sum>=10?1:0);
			
			head.next = more;
		}
		
		return head;
	}
	
	
}
