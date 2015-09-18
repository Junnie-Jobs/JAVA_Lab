
public class RemoteData {

	public String name;
	public String address;
	
	public RemoteData(){};
	public RemoteData(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public void sayHello(){
		System.out.println(this.name + "¥‘ æ»≥Á«œººø‰.");
	}
	public void sayHello(String name){
		this.name = name;
		System.out.println(this.name + "¥‘ æ»≥Á«œººø‰.");
	}
}
