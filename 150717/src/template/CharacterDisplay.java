package template;

public class CharacterDisplay extends AbstractDisplay{

	char ch;
	
	public CharacterDisplay(char ch){
		this.ch = ch;
	}
	
	@Override
	public void begin() {
		System.out.println("<<");
	}

	@Override
	public void display() {
		System.out.println(ch);
	}

	@Override
	public void end() {
		System.out.println(">>");
	}
	
	public void line(){
		System.out.println();
		System.out.println("======================");
	}
}
