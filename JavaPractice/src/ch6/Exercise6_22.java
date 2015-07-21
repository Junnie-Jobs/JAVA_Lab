package ch6;

public class Exercise6_22 {

	public static boolean isNumber(String str){
		int len = str.length();
		
		if(str==null || len == 0){
			return false;
		}
		
		for(int i=0; i<len; i++){
			char check = str.charAt(i);
			if(check < 0 || check > 9)
				return false;
		}
		
		return true;
	}
}
