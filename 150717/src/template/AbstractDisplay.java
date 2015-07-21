package template;

public abstract class AbstractDisplay {

	public abstract void begin();
	public abstract void display();
	public abstract void end();
	
//	hook 메소드라고 한다.
	public void line(){};
	
	
//	일종의 시나리오 묘사. 변경되면 안되기에 final을 붙인다.
//	이런것을 template method라고 한다.
	public final void show() {
		begin();
		
		for(int i=0; i<5; i++){
			display();
		}
		
		end();
		line();
	}
}
