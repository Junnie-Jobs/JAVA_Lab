package thread;

import java.io.IOException;

//class MyThread extends Thread{
class MyThread extends Thread{
	
	//default value is false
	boolean flag;
	
	public MyThread(String name){
		super(name);
	}
	
	//반드시 구현해야 하는 항목
	public void run(){
		
		while(!flag){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println( getName() + " is terminated");
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
}


public class MyThreadTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("main start");
		
		MyThread threadA = new MyThread("A");
		MyThread threadB = new MyThread("B");
		MyThread threadC = new MyThread("C");
		
//		Thread th1 = new Thread(runnable);
//		Thread th2 = new Thread(runnable);
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int input = System.in.read();
		
		while(input != 1){
			char ch = (char)input;
			
			if(ch == 'A'){
				threadA.setFlag(true);
			}else if(ch == 'B'){
				threadB.setFlag(true);
			}else if(ch == 'C'){
				threadC.setFlag(true);
			}else if(ch == 'M'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() +" terminated");
	}

}
