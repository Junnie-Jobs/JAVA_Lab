package thread;

class Bank{
	private int money = 10000;

//	synchronized 키워드를 추가하는 방식으로 간단히 해결
//	수행문 방식과 메소드 방식이 있다.
//	위가 수행문 방식, 아래가 메소드 방식
	
	public void deposite(int save){
		
		synchronized(this){
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.setMoney(m + save);
		}
	}
	
	public synchronized void withdraw(int minus){
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setMoney(m - minus);
		
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}



class Park extends Thread{
	
	public void run(){
		 
		SyncMain.MyBank.deposite(3000);
		System.out.println("Deposite(3000) : "+SyncMain.MyBank.getMoney());
	}
	
}

class ParkWife extends Thread{
	
	public void run(){
		
		SyncMain.MyBank.withdraw(1000);
		System.out.println("Withdraw(1000) : "+SyncMain.MyBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank MyBank = new Bank();
	public static void main(String[] args) {
		
		Park p = new Park();
		ParkWife pw = new ParkWife();
		
		System.out.println(SyncMain.MyBank.getMoney());

		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.start();

	}
}
