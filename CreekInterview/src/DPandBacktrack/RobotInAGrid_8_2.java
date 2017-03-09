package DPandBacktrack;

import java.util.ArrayList;
import java.util.HashSet;

import common.Point;

public class RobotInAGrid_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	ArrayList<Point> getPath(boolean [][]maze){
		if (maze==null || maze.length == 0) return null;
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failedPoints = new HashSet<Point>();
		if (getPath(maze, maze.length-1, maze[0].length-1, path, failedPoints)){
			return path;
		}
		return null;
	}
	
	boolean getPath1(boolean[][]maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoint){
		if (col<0 || row<0 || !maze[row][col]) return false;
		if ((row==0) && (col==0) || getPath(maze, row, col-1, path, failedPoint)
				||getPath(maze, row-1, col, path, failedPoint)){
			Point p = new Point(row, col);
			path.add(p);
			return true;
		}
		return false;
	}
	//improvement, cache result
	boolean getPath(boolean[][]maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoint){
		if (col<0 || row<0 || !maze[row][col]) return false;
		
		Point p = new Point(row, col);
		//judge here
		if (failedPoint.contains(p)) return false;
		if ((row==0) && (col==0) || getPath(maze, row, col-1, path, failedPoint)
				||getPath(maze, row-1, col, path, failedPoint)){
			
			path.add(p);
			return true;
		}
		//cache here
		failedPoint.add(p);
		return false;
	}
}
