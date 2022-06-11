package OOP;

class person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {
	public static void main(String[] args) {
		
		person person1 = new person();		//instantiate an object 
		
		// Define some properties
		person1.name = "joe";
		person1.email = "joekjc@testmail.com";
		person1.phone = "987322309";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		person person2 = new person();	//instantiate an object 
		
		// Define some properties
		person2.name = "Sarah";
		person2.email = "sara@testemail.com";
		person2.phone = "782398231";
		
		//Abstraction
		person2.sleep();
		
		
		/*String name = "Joe";
		String email = "Joe@testemail.com";
		String phone = "9386472932";
		
		String name2 = "owais";
		String email2 = "owaiskxn@gmail.com";
		String phone2 = "8327498754";
		
		
	
	}
	static void walking(String name) {
		System.out.println(name + " is walking");
		}
	static void eating(String name) {
		System.out.println(name + " is eating");
		
	}*/
	}
}


