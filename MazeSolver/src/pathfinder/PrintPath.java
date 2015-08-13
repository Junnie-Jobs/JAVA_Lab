package pathfinder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PrintPath {

	public void findPathByDirection() throws IOException{
		
		FileInputStream fis = new FileInputStream("maze.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String direction = prop.getProperty("DIRECTION");
		
		if(direction == "4"){
			
			return;
		}
		if(direction == "8"){
			
			return;
		}
		return ;
	}
}
