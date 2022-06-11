package OOP;

public class CDAccount extends bankAccount implements IRate{
	
	String interestRate;
	
	void compound() {
		System.out.println("Compounding interest: ");
		
	}
}
