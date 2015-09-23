package num8;

public class LineText extends TextView{
	private TextView textview;
	
	public LineText(TextView textview){
		this.textview = textview; 
	}
	public void viewing(){
		System.out.print("Line ");
		this.textview.viewing();
	}
}
