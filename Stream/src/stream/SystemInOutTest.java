package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInOutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("입력 후 마지막에 '끝'을 입력하세요.");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			int i;
//			while((i = System.in.read()) != '\n'){
			while((i = isr.read()) != '끝'){
				System.out.print((char)i);
			}
//			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
