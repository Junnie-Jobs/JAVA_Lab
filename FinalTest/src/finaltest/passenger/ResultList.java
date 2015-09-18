package finaltest.passenger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

import finaltest.policy.DefaultPolicy;

public class ResultList {
	private static PriorityQueue<Passenger> resultQueue = new PriorityQueue<Passenger>(50, new DefaultPolicy());
	
	public static void makeResultFile(){
		makeResultFile("result");
	}
	
	public static void makeResultFile(String fileName){
		
		try {
			String fileSrc = "/Users/NEXT/Documents/JAVA_Lab/FinalTest/src/data/"+ fileName +".csv";
			File csv = new File(fileSrc);
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv));
			
			bw.write("아이디,이름,부스도착시간,매표소요시간,이동소요시간,출발역,도착역,대기시간,출발시간,도착시간\n");
			bw.write(makeBody());
			bw.close();
			System.out.println("파일 생성 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void addResult(Passenger p){
		resultQueue.add(p);
	}
	
	public static void showResult(){
		System.out.println("============= 결과 목록 =============");
		System.out.println("[아이디]\t[이름]\t[부스도착]\t[매표소요]\t[이동소요]\t[대기시간]\t[출발시간]\t[도착시간]");
		Iterator<Passenger> iter = resultQueue.iterator();
		while(iter.hasNext()){
			Passenger c = iter.next();
			System.out.print(c);
			System.out.println("\t"+
				"  "+c.getReadyTime() +"분\t"+
				"  "+c.getLeaveTime() +"분\t"+
				"  "+c.getFinalTime()+"분"
			);
		}
	}
	
	public static int getNumOfResult(){
		int num=0;
		Iterator<Passenger> iter = resultQueue.iterator();
		while(iter.hasNext()){
			Passenger c = iter.next();
			num++;
		}
		return num;
	}
	
	private static String makeBody(){
		String result = "";
		Iterator<Passenger> iter = resultQueue.iterator();
		while(iter.hasNext()){
			Passenger c = iter.next();
			result += c.getResultData()+"\n";
		};
		return result;
	}
}
