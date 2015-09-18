package finaltest.station;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TravelTimeTable {

	private static String fileSrc = "/Users/NEXT/Documents/JAVA_Lab/Final/src/data/timeTable.csv";
	private static HashMap<String , Integer> map;
	
	public static int[][] table = null;

	public static int[][] makeTimeTable(){
		map = new HashMap<String , Integer>();
		table = new int[7][7];
		int row = 0;
		try {
	        File csv = new File(fileSrc);
	        BufferedReader br = new BufferedReader(new FileReader(csv));
	        String line = br.readLine();
	        
	        while ((line = br.readLine()) != null) {
//	        	System.out.println(line);
	            String[] token = line.split(",");
	            for(int i=0; i<7; i++){
	            	table[row][i] = Integer.parseInt(token[i+1]);
	            }
	            row++;
	        }
	        br.close();
	        
	        map.put("Seoul", 0);
	        map.put("Chuncheon", 1);
	        map.put("Wonju", 2);
	        map.put("Gyeongju", 3);
	        map.put("Deajeon", 4);
	        map.put("Asan", 5);
	        map.put("Gwangju", 6);
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
		return table;
	}
	
	public static void showTable(){
		System.out.println("============= 소요 시간 표! =============");
		for(int i=0; i<7; i++){
			for(int j=0; j<7; j++){
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int travelTime(String from, String to){
		return table[map.get(from)][map.get(to)];
	}
}
