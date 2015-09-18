package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i;
		int len = 0;
		long pseconds = System.currentTimeMillis();
		
		try {
			while( (i = bis.read()) != -1){
				bos.write(i);
				len++;
			}
			pseconds = System.currentTimeMillis() - pseconds;
			
			System.out.println("len : " + len + "bytes (" + pseconds + " pseconds)");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
