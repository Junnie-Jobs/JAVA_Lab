package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class ReadSrc {

	public static void getFile(HashMap<String, String> map, String fileName){

		try {
			String fileSrc = "/Users/NEXT/Desktop/KHAN/"+ fileName +".csv";

	        File csv = new File(fileSrc);
	        BufferedReader br = new BufferedReader(new FileReader(csv));
	        String line = br.readLine();
	        
	        while ((line = br.readLine()) != null) {
	            String[] token = line.split(",");
	            
	    		int[] pos = new int[10];
	    		int index=0;
	    			            
//	    		추출, "를 가진 요소 파악, 저장
	            for(int i=0; i<token.length; i++){
	            	if(token[i].contains("\"")){
	            		pos[index]=i;
	            		System.out.print(token[i]);
	            		index++;
	            	}
	            }System.out.println("   "+index);
	            
//	            "를 가진 요소들 결합, 배열 재 조정
//	            pos의 길이는 무조건 짝수....
//	            for(int a = 0; a<pos.length/2;a++){
//	            	boolean con = true;
//		            while(con){
//		            	token[pos[2*a]] += token[pos[2*a]+1];
//		            	for(int i = pos[2*a]+1; i<token.length-1; i++)
//		            		token[i] = token[i+1];
//		            	if(token[pos[2*a+1]] != token[pos[2*a]+1]){
//		            		con = false;
//		            	};
//		            };
//	            };
//	            
//	            System.out.println("asdf");
//	            다시 한번 출력해볼까나
//	            for(int i=0; i<token.length; i++){
//	            	System.out.print(token[i]+" || ");
//	            }System.out.println();
	            
//	            map.put(token[7], line);
//	            System.out.print(token[7]+"\t");
	        }
	        br.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
}
