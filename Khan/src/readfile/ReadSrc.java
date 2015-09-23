package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class ReadSrc {
	
	public static HashMap<String, String> getFile(String fileName){
		return getFile(fileName, 7, 13);
	}
	
	public static HashMap<String, String> getFile(String fileName, int num1, int num2){

		HashMap<String, String> map = new HashMap<String, String>();
		
		try {
			String fileSrc = "/Users/NEXT/Desktop/KHAN/"+ fileName +".csv";

	        File csv = new File(fileSrc);
	        BufferedReader br = new BufferedReader(new FileReader(csv));
	        String line = br.readLine();
	        
	        int lineNum = 1;
	        while ((line = br.readLine()) != null) {
	            String[] token = line.split(",");
	            String[] result = new String[20];
	            
	    		int index=0;
      
//	    		추출, "를 가진 요소 파악, 저장
	            for(int i=0; index<token.length; i++){
	            	
	            	result[i] = token[index];

		    		boolean con1 = false;
	            	if(token[index].contains("\"")){
	            		con1 = true;
	            	};
	            	if(token[index].contains("\"\"")){
	            		con1 = false;
	            	};
	            	if(token[index].contains("\"\"\"")){
	            		con1 = true;
	            	};
	            	if(token[index].startsWith("\"")){
	            		con1 = true;
	            	}
	            	if(token[index].startsWith("\"") && token[index].endsWith("\"")){
	            		con1 = false;
	            	};
	            	if(token[index].startsWith("\"\"\"") && token[index].endsWith("\"\"")){
	            		con1 = true;
	            	};
	            	while(con1){
	            		index++;
//	            		System.out.println(index);
//	            		System.out.println(result[i]);
	            		result[i] += (","+token[index]);
	            		if(token[index].contains("\"")){
		            		con1 = false;
		            		if(token[index].contains("\"\"")){
			            		con1 = true;
		            		};
//		            		예외들 젠장
		            		if(token[index].contains("\"\" \"")){
			            		con1 = false;
		            		};
		            		if(token[index].contains("\"\")\"")){
			            		con1 = false;
		            		};
		            		if(token[index].contains("\"\"\"")){
			            		con1 = false;
			            	};
			            	if(token[index].endsWith("\"")){
			            		con1 = false;
			            	}
//		            		System.out.println(result[i]);
		            	};
	            	};
	            	index++;
	            }
	            
	            if(result[num2] != null){
	            	lineNum++;
//		            System.out.println("[num: "+ lineNum +"] "+result[num2]);
	            	map.put(result[num1], line);
	            }
	        }
	        br.close();
	        System.out.println("[ "+fileName+" ]");
	        System.out.println("[파일 위치] : "+fileSrc);
	        System.out.println("[총 라인 수] : "+lineNum);
	        System.out.println();
		}
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
		return map;
	}
	
	
	
	
	public static HashMap<String, String> getSrcFile(String fileName, int num){

		HashMap<String, String> map = new HashMap<String, String>();
		
		try {
			String fileSrc = "/Users/NEXT/Desktop/KHAN/"+ fileName +".csv";

	        File csv = new File(fileSrc);
	        BufferedReader br = new BufferedReader(new FileReader(csv));
	        String line = br.readLine();
	        
	        int lineNum = 1;
	        while ((line = br.readLine()) != null) {
	            String[] token = line.split(",");
	            String[] result = new String[20];
	            
	    		int index=0;
      
//	    		추출, "를 가진 요소 파악, 저장
	            for(int i=0; index<token.length; i++){
	            	
	            	result[i] = token[index];

		    		boolean con1 = false;
	            	if(token[index].contains("\"")){
	            		con1 = true;
	            	};
	            	if(token[index].contains("\"\"")){
	            		con1 = false;
	            	};
	            	if(token[index].contains("\"\"\"")){
	            		con1 = true;
	            	};
	            	if(token[index].startsWith("\"")){
	            		con1 = true;
	            	}
	            	if(token[index].startsWith("\"") && token[index].endsWith("\"")){
	            		con1 = false;
	            	};
	            	if(token[index].startsWith("\"\"\"") && token[index].endsWith("\"\"")){
	            		con1 = true;
	            	};
	            	while(con1){
	            		index++;
//	            		System.out.println(index);
//	            		System.out.println(result[i]);
	            		result[i] += (","+token[index]);
	            		if(token[index].contains("\"")){
		            		con1 = false;
		            		if(token[index].contains("\"\"")){
			            		con1 = true;
		            		};
//		            		예외들 젠장
		            		if(token[index].contains("\"\" \"")){
			            		con1 = false;
		            		};
		            		if(token[index].contains("\"\")\"")){
			            		con1 = false;
		            		};
		            		if(token[index].contains("\"\"\"")){
			            		con1 = false;
			            	};
			            	if(token[index].endsWith("\"")){
			            		con1 = false;
			            	}
//		            		System.out.println(result[i]);
		            	};
	            	};
	            	index++;
	            }
	            
//	            System.out.println("[num: "+ lineNum +"] "+result[num]);

	            if(result[13] != null){
	            	lineNum++;
	            	map.put(result[num], line);
	            }
	        }
	        br.close();
	        System.out.println("[ Get SrcFile "+fileName+" ]");
	        System.out.println("[파일 위치] : "+fileSrc);
	        System.out.println("[총 라인 수] : "+lineNum);
	        System.out.println();
		}
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
		return map;
	}
	
}
