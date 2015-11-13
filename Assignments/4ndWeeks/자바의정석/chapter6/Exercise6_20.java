package chapter6;

public class Exercise6_20 {
	
	public static int[] shuffle(int[] arr) {
		
		if(arr.length == 0 || arr==null)
			return arr;
		
		for(int x=0; x<arr.length; x++)
		{
			int i=(int)(Math.random()*arr.length);
			int j=(int)(Math.random()*arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

	

}
