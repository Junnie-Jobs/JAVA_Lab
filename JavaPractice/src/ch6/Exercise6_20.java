package ch6;

public class Exercise6_20 {

	public static int[] shuffle(int[] arr){
		int len = arr.length;
		if(len == 0){
			System.out.println("arr length 0");
			return arr;
		}
		
		for(int i=0; i<len; i++){
			int x = (int)(Math.random()*len);
			int y = (int)(Math.random()*len);
			
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
		}
		return arr;
	}
}
