package finaltest.passenger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MakePassengerList {
	private static String fileSrc = "/Users/NEXT/Documents/JAVA_Lab/FinalTest/src/data/passengerList.csv";
	
	public static ArrayList<Passenger> makeList(){
		ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

		try {
	        File csv = new File(fileSrc);
	        BufferedReader br = new BufferedReader(new FileReader(csv));
	        String line = br.readLine();
	        
	        while ((line = br.readLine()) != null) {
	            String[] token = line.split(",");
	            passengerList.add(new Passenger(token));
	        }
	        br.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
		
		return passengerList;
	}
}