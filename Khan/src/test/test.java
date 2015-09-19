package test;

import java.util.HashMap;

import readfile.ReadSrc;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		ReadSrc.getFile(map1, "ko_all_videos_src");
//		ReadSrc.getFile(map2, "csv - 20150823");
	}
}
