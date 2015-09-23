package readfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {

	public static void makeResultFile(String fileName, String result){
		
		try {
			String fileSrc = "/Users/NEXT/Desktop/KHAN/"+ fileName +".csv";
			File csv = new File(fileSrc);
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv));
			
			String header = "Domain,Subject,Topic,Tutorial,Transcript,en,ko,title,slug,duration,en_date_added,ko_date_added,TEST,LIVE\n";
			bw.write(header);
			bw.write(result);
			bw.close();
			
			System.out.println(fileSrc);
			System.out.println("颇老 积己 肯丰");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

public static void makeResultFile2(String fileName, String result){
		
		try {
			String fileSrc = "/Users/NEXT/Desktop/KHAN/"+ fileName +".csv";
			File csv = new File(fileSrc);
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv));
			
			String header = "Domain,Subject,Topic,Tutorial,Transcript,en,ko,,title,slug,duration,en_date_added,ko_date_added,TEST,LIVE\n";
			bw.write(header);
			bw.write(result);
			bw.close();
			
			System.out.println(fileSrc);
			System.out.println("颇老 积己 肯丰");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
