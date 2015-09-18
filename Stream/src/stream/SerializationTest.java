package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	String name;
	int age;
		
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void aging(){
		age++;
	}
	
	public String toString(){
		return this.name +"," + this.age;
	}
	
}


public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Person person1 = new Person("이승기", 20);
		Person person2 = new Person("권지용", 28);

		person1.aging();
		person2.aging();
		
		FileOutputStream fos = new FileOutputStream("serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//Serialization
		oos.writeObject(person1);
		oos.writeObject(person2);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//deSerialization
		Person ps1 = (Person)ois.readObject();
		Person ps2 = (Person)ois.readObject();
		
		System.out.println(ps1);
		System.out.println(ps2);
		
	}
}
