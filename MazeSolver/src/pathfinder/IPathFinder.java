package pathfinder;

import java.util.ArrayList;

import maze.Maze;
import point.Point;

public interface IPathFinder {

	public void findPath(Maze maze);

	public int runAStarAlgorithm(ArrayList<Point> validPoints, Point currentPoint, Point endPoint);
	public ArrayList<Point> checkDirection(Maze maze, Point currentPoint, Maze visitedList);
	public Point findStartPoint(Maze maze);
	public Point findEndPoint(Maze maze);
}
