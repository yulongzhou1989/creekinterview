package common;

public class Node {
	public Node next = null;
	public int data;
	
	public Node(int data){
		this.data = data;
	}
	
	void appendToTail(int d){
		
		Node end = new Node(d);
		Node n = this;
		
		while (this.next != null){
			n = n.next; 
		}
		
		this.next = end;
	}
}
