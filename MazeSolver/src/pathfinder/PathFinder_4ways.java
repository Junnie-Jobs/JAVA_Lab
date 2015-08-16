package pathfinder;

import maze.Maze;
import point.Point;
import util.Define;
import java.util.ArrayList;

public class PathFinder_4ways implements IPathFinder {
	
	public ArrayList<Point> pointList = new ArrayList<Point>();
	
	@Override
	public void findPath(Maze maze) {
		Point currentPoint = findStartPoint(maze);
		Point endPoint = findEndPoint(maze);
		
		Maze visitedList = maze;
		ArrayList<Point> validPoints;
		ArrayList<Point> pointStack = new ArrayList<Point>();

		while(true){

			pointList.add(currentPoint);
			if(currentPoint.getValue().equals(endPoint.getValue())){
				break;
			}
			
			validPoints = checkDirection(maze, currentPoint, visitedList);

//		이동할 수 있는 가짓 수에 따라서 다른 행동(0, 1, 2+)
			if(validPoints.size() == 0){
				if(pointStack.size() == 0){
					System.out.println("더 이상 길이 없습니다!!!");
					break;
				}
				currentPoint = pointStack.get(pointStack.size()-1);
				pointStack.remove(pointStack.size()-1);
			}

			if(validPoints.size() == 1){
				currentPoint = validPoints.get(0);
			}
		
//		이동가능한 길이 둘 이상일 경우, 스택에 위치 저장.
			if(validPoints.size() > 1){
				pointStack.add(currentPoint);
				
				int minValueIndex = runAStarAlgorithm(validPoints, currentPoint, endPoint);
				currentPoint = validPoints.get(minValueIndex);
			}
			
//		이동 가능 점에 대한 작업을 마치면 현 위치의 방문 여부를 표시해 둡니다.
			visitedList.setPointValue(currentPoint.getPoint_x(), currentPoint.getPoint_y(), Define.WALL);
		}
	}

	@Override
	public void printResult(){
		for(int i=0; i<pointList.size(); i++){
			Point point = pointList.get(i);
			int x = point.getPoint_x();
			int y = point.getPoint_y();
			System.out.println("("+x +","+y+") : "+pointList.get(i).getValue());
		}
		
		System.out.println("Pathfinding Complete : "+(pointList.size()+1)+"회");
	}
	
	@Override
	public int runAStarAlgorithm(ArrayList<Point> validPoints, Point currentPoint, Point endPoint){
	
		int minValueIndex = 0;
		
		for(int i=0; i<validPoints.size(); i++){
			Point point = validPoints.get(i);
			Point nextPoint = validPoints.get(minValueIndex);
			
			int g = 10;
			int h = 10*(endPoint.getPoint_x() - point.getPoint_x() + endPoint.getPoint_y() - point.getPoint_y());
			
			point.setAStarValue(g+h);
			if(point.getAStarValue() <= nextPoint.getAStarValue()){
				minValueIndex = i;
			}
		}
		return minValueIndex;
	}
	
	@Override
	public ArrayList<Point> checkDirection(Maze maze, Point currentPoint, Maze visitedList){
		
		ArrayList<Point> validPoints = new ArrayList<Point>();
		
		int x = currentPoint.getPoint_x();
		int y = currentPoint.getPoint_y();
		
		validPoints.add(new Point(x, y-1, maze.getPointValue(x, y-1)));
		validPoints.add(new Point(x+1, y, maze.getPointValue(x+1, y)));
		validPoints.add(new Point(x, y+1, maze.getPointValue(x, y+1)));
		validPoints.add(new Point(x-1, y, maze.getPointValue(x-1, y)));
		
		for(int i=validPoints.size()-1; i>-1; i--){
			int temp_x = validPoints.get(i).getPoint_x();
			int temp_y = validPoints.get(i).getPoint_y();
			
			if(validPoints.get(i).getValue().equals(Define.WALL) || visitedList.getPointValue(temp_x, temp_y).equals(Define.WALL)){
				validPoints.remove(i);
				continue;
			}
		}
		return validPoints;
	}
	
	@Override
	public Point findStartPoint(Maze maze){
		for(int i=0; i<maze.maze.size(); i++){
			for(int j=0; j<maze.maze.size(); j++){
				if(maze.maze.get(i).get(j).equals(Define.START)){
					return new Point(i, j, Define.START);
				}
			}
		}
		System.out.println("invalidPoint");
		return null;
	}

	@Override
	public Point findEndPoint(Maze maze){
		for(int i=0; i<maze.maze.size(); i++){
			for(int j=0; j<maze.maze.size(); j++){
				if(maze.maze.get(i).get(j).equals(Define.END)){
					return new Point(i, j, Define.END);
				}
			}
		}
		System.out.println("invalidPoint");
		return null;
	}
}
