package maze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import util.Define;


public class Maze {
	
	public ArrayList<ArrayList<String>> maze = new ArrayList<ArrayList<String>>();
	private StringBuffer buffer = new StringBuffer();
	
	public void buildMaze() throws IOException{
		
		String fileName = "maze.txt";
		String line = null;
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		line = br.readLine();
		while (line != null)
		{
		    ArrayList<String> lineList = new ArrayList<String>();
	
		    for (int i = 0; i < line.length(); i++)
		    {
		        lineList.add(line.substring(i, i+1));
		    }
		    maze.add(lineList);
		    line = br.readLine();
		}
	}

	public void printMaze() {
		ArrayList<ArrayList<String>> maze = this.maze;
		
	    for (int i=0; i < maze.size(); i++) {
	        for (int j=0; j<maze.get(i).size(); j++) {
	        	String point = maze.get(i).get(j);
	        	buffer.append(point);
	        }
	        buffer.append("\n");
	    }
	    System.out.println(buffer);
	}
	
	
	
	
	public void setStartPoint(int i, int j){
		if(isInvalidPoint(i, j))
			return;
		this.maze.get(j).set(i, Define.START);
	}
	
	public void setEndPoint(int i, int j){
		if(isInvalidPoint(i, j))
			return;
		this.maze.get(j).set(i, Define.END);
	}
	
	public String getPointValue(int i, int j){
		if(isInvalidPoint(i, j))
			return null;
		return this.maze.get(j).get(i);
	}
	
	public void setPointValue(int i, int j, String value){
		if(isInvalidPoint(i, j))
			return;
		this.maze.get(j).set(i, value);
	}
	
	
	
	private boolean isInvalidPoint(int i, int j){
		if(i < Define.MININDEX || i > Define.MAXINDEX || j < Define.MININDEX || j > Define.MAXINDEX){
			System.out.println("Invalid Point");
			return true;
		}
		return false;
	}
}
