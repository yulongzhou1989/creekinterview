package TreesAndGraphs.BuildOrder5_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project {
	public enum State {COMPLETE, PARTIAL, BLANK};
	private State state = State.BLANK;
	public State getState() {return state;}
	public void setState(State state){
		this.state = state;
	}
	private ArrayList<Project> children = new ArrayList<Project>();
	private Map<String, Project> map = new HashMap<String, Project>();
	private String name;
	public String getName(){
		return name;
	}
	public ArrayList<Project> getChildren(){
		return children;
	}
	
	private int dependencies = 0;
	public int getNumberDependencies () {
		return dependencies;
	}
	public void increaseDependencies () { dependencies ++;}
	public void decreaseDependencies () { dependencies --;}
	
	public Project(String name) {this.name = name;}
	public void addNeighbor(Project node){
		if (!map.containsKey(node.getName())){
			children.add(node);
			map.put(node.getName(), node);
			node.increaseDependencies();
		}
	}
}
