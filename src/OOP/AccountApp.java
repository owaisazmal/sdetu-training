package OOP;

public class AccountApp {
	public static void main(String[] args) {

	LoanAccount la = new LoanAccount();
	la.increaseRate();
	la.setRate();
	la.setAmmountSchedule();
	la.setTerm(20);
	
	//Polymorphism
	IRate acnt1 = new LoanAccount();
	acnt1.setRate();
	acnt1.increaseRate();
	}
}
