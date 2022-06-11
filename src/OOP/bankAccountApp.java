package OOP;

public class bankAccountApp {

	public static void main(String[] args) {
		
		bankAccount acc1 = new bankAccount();
		acc1.setName("Roggers Hue");	//with Encapsulation
		acc1.accNumber = "98374298347";
		acc1.setssn("98439873");
		acc1.balance = 10000;
		System.out.println(acc1.getName());
		System.out.println("SSN: " + acc1.getssn());
		
		acc1.deposit(1500);
		System.out.println(acc1.toString());
		
		
		
		//polymorphism through overriding
		System.out.println(acc1.toString());
		
		//polymorphism through overloading
		bankAccount acc2 = new bankAccount("Checking Account");
		
		bankAccount acc3 = new bankAccount("Checking Account", 10000);
		
		
		/*acc3.checkBalance();
		
		
		//Demo of inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.withdraw(1089);
		cd1.checkBalance();  
*/
	}

}
