package finaltest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import finaltest.passenger.MakePassengerList;
import finaltest.passenger.Passenger;
import finaltest.passenger.ResultList;
import finaltest.policy.DefaultPolicy;
import finaltest.station.Platform;
import finaltest.station.TicketBooth;
import finaltest.station.TravelTimeTable;


public class Main {
	public static int curTime = 0;	
	public static void main(String[] args) {
		
//		승객 리스트 생성
		ArrayList<Passenger> passengerList = MakePassengerList.makeList();

//		승객 받을 booth 생성
		TicketBooth booth = new TicketBooth();
		
//		열차 대기할 플랫폼
		Platform platform = Platform.getInstance();
		TravelTimeTable.showTable();
		
//		동작 cycle
//		모든 승객의 결과가 나올 때까지 돌아갑니다.
		while(ResultList.getNumOfResult() < 50){
			System.out.println("**** 현재시각 : "+curTime+"분 *********************");
			System.out.println("============= 현재시간 입장 부스 입장 전 =============");
			System.out.println("[아이디]\t[이름]\t[부스도착]\t[매표소요]\t[이동소요]");
			Iterator<Passenger> iter = passengerList.iterator();
			while(iter.hasNext()){
				Passenger c = iter.next();
				System.out.println(c);
				if(curTime == c.getArrivalTime()){
					booth.addWaitingQueue(c);
					iter.remove();
				}
			}
//			booth.showReadyQueue();
			booth.doTicketing();
			booth.showTicketing();
			booth.showReadyQueue();
			platform.leaveTrain();
			platform.showTrainWaiting();
			curTime++;
		}
		ResultList.showResult();
		ResultList.makeResultFile("Result_2");
	}

}
