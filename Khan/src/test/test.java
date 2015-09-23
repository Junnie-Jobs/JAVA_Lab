package test;

import java.util.HashMap;
import java.util.Iterator;

import readfile.FileMaker;
import readfile.ReadSrc;

public class test {

	public static void main(String[] args) {

		HashMap<String, String> mapSrc = ReadSrc.getFile("ko_all_videos (2)", 7,13);
		HashMap<String, String> map2 = ReadSrc.getFile("csv - 20150823", 8,14);
		
//		mapSrc에는 있지만 map2에는 없는거...
		String result = compareHash(mapSrc, map2);
        FileMaker.makeResultFile("result_added", result);
        System.out.println();
        
//		map2에는 있지만 map1에는 없는거...
		String result2 = compareHash(map2, mapSrc);
		FileMaker.makeResultFile2("result_deleted", result2);
        System.out.println();

	}
	
	public static String compareHash(HashMap<String, String> map1, HashMap<String, String> map2){
		String result = "";
		
		int lineNum = 0;
		
		Iterator<String> keys1 = map1.keySet().iterator();
        while( keys1.hasNext() ){
            String key = keys1.next();
            if(!map2.containsKey(key)){
            	lineNum++;
            	System.out.println("[line : "+lineNum+" ]\t"+map1.get(key));
            	result += map1.get(key)+"\n";
            }
        }

        System.out.println("총 신규 라인 수 : "+lineNum);
		return result;
	}
	
}
