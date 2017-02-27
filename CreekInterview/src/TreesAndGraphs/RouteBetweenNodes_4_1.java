package TreesAndGraphs;

import java.util.LinkedList;

public class RouteBetweenNodes_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean search(Graph g, Node start, Node end){
		if (start == end) return true;
		
		LinkedList<Node> q = new LinkedList<Node> ();
		
		for (Node u: g.getNodes()){
			u.state = "Unvisited";
		}
		
		start.state = "Visiting";
		q.add(start);
		Node u;
		while (!q.isEmpty()){
			u = q.removeFirst();
			if (u != null){
				for (Node v:u.getAdjacent()){
					if(v.state == "Unvisited"){
						if (v == end){
							return true;
						} else {
							v.state = "Visiting";
							q.add(v);
						}
					}
				}
				u.state = "Visited";
			}
		}
		return false;
	}
}
