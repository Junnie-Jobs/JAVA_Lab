package thread;

import java.util.ArrayList;
import java.util.Vector;

class Library{
	public Vector<String> nextShelf = new Vector<String>();
	
	public Library(){
		nextShelf.add("태백산맥1");
		nextShelf.add("태백산맥2");
		nextShelf.add("태백산맥3");
//		nextShelf.add("태백산맥4");
//		nextShelf.add("태백산맥5");
	}
	
	public synchronized String lendBook() throws InterruptedException{
		
		Thread t = Thread.currentThread();
		
		while(nextShelf.size() == 0){
			System.out.println("["+ t.getName() + "] : 기다린다");
			this.wait();
			System.out.println("["+ t.getName() + "] : 기다림은 끝이다!");
//			return null;
		}
		
		String name = nextShelf.remove(0);
		System.out.println("["+ t.getName() + "] : " +name + " 빌림");
		return name;
	}
	
	public synchronized void returnBook(String name){
		Thread t = Thread.currentThread();

		nextShelf.add(name);
		this.notifyAll();
		System.out.println("["+ t.getName() + "] : " +name + " 반납");
		System.out.println("집에 간다 ["+ t.getName() + "]");
	}
}

class Student extends Thread{
	
	public void run(){
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null){
				System.out.println("[" + this.getName() +"] : 으앙 집 감 ㅠㅠ");
				return;
			}
			Thread.sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


public class LibraryMain {

	public static Library library = new Library();
	public static void main(String[] args) {

		Student s0 = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		

		System.out.println(library.nextShelf);
		
		s0.start();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	}

}
