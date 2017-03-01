package TreesAndGraphs.BuildOrder5_7;

import java.util.ArrayList;
import java.util.Stack;

public class BuildOrder_4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//o(P+D) time
	Stack<Project> findBuildOrder(String [] projects, String [][]dependencies){
		Graph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
	}
	
	Stack<Project> orderProjects(ArrayList<Project> projects){
		Stack<Project> stack = new Stack<Project>();
		for (Project project:projects){
			if (project.getState() == Project.State.BLANK){
				if (!doDFS(project, stack)){
					return null;
				}
			}
		}
		return stack;
	}

	boolean doDFS(Project project, Stack<Project> stack){
		if (project.getState() == Project.State.PARTIAL){
			return false;
		}
		
		if (project.getState() == Project.State.BLANK){
			project.setState(Project.State.PARTIAL);
			ArrayList<Project> children = project.getChildren();
			for (Project child:children){
				if (!doDFS(child, stack)){
					return false;
				}
			}
			
			project.setState(Project.State.COMPLETE);
			stack.push(project);
		}
		return true;
	}
	
	
	Graph buildGraph(String [] projects, String [][] dependencies){
		Graph graph = new Graph();
		for (String project: projects){
			graph.getOrCreateNode(project);
		}
		
		for (String [] dependency:dependencies){
			graph.addEdge(dependency[0], dependency[1]);
		}
		
		return graph;
	}
}
