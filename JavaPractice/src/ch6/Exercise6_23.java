package ch6;

public class Exercise6_23 {

	public static int max(int[] arr){
		int len = arr.length;
		int max = 0;
		if(len == 0){
			System.out.println("arr length is 0");
			max = -1;
			return max;
		}
		
		for(int i=0; i<len; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
}
