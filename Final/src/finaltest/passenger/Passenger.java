package passenger;

public class Passenger {

	private int id;
	private String name;
	private int arrivedTime;
	private int ticketingTime;
	private String stationFrom;
	private String stationTo;
	
//	»ý¼ºÀÚ
	Passenger(String[] token){
		this.id = Integer.parseInt(token[0]);
		this.name = token[1];
		this.arrivedTime = Integer.parseInt(token[2]);
		this.ticketingTime = Integer.parseInt(token[3]);
		this.stationFrom = token[4];
		this.stationTo = token[5];
	}
	
	
	public int getId(){
		return this.id;
	}
	public int getArrivalTime(){
		return this.arrivedTime;
	}
	public int getTicketingTime(){
		return this.ticketingTime;
	}

	@Override
	public String toString() {
		return 	id + ", " + 
				name + ", " + 
				arrivedTime + ", " + 
				ticketingTime+", " +
				stationFrom+", " +
				stationTo+"\n";
	}
	
	
}
