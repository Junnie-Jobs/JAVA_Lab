package exception;

import java.net.Socket;

public class ExceptionText {

	public static void main(String[] args) {

		String greeting[] = {"안녕하세요", "반갑습니다", "잘가요"};
		
		for(int i=0; i<4; i++){
			try{
				System.out.println(greeting[i]);
				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}finally{
				System.out.println("always printed");
				
			}
		}
	}
}
