package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import maze.Maze;
import pathfinder.IPathFinder;
import pathfinder.PathFinder_4ways;
import pathfinder.PathFinder_8ways;

public class TestMaze {

	public static void main(String[] args) {

		try{
			Maze maze = new Maze();

			maze.buildMaze();
			
			maze.setStartPoint(1, 1);
			maze.setEndPoint(8, 8);
			
			maze.printMaze();
			
			
			FileInputStream fis = new FileInputStream("maze.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String finderType = prop.getProperty("DIRECTION");

			IPathFinder finder = new PathFinder_4ways();
			
			if(finderType.equals("4")) {
				System.out.println("4 direction finding");
				finder = new PathFinder_4ways();
			}
			
			if(finderType.equals("8")) {
				System.out.println("8 direction finding");
				finder = new PathFinder_8ways();
			}
			
			finder.findPath(maze);
			
			
//		이하 예외처리
		}catch(IOException e){
			System.out.println("ERROR");
			e.printStackTrace();
		}catch(IndexOutOfBoundsException e){
			System.out.println("ERROR::IndexOut");
			e.printStackTrace();
		}
	}

}