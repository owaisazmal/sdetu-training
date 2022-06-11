package Labs;

public class BankAccountApp {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("8233449265", 1000.35);
		BankAccount acc2 = new BankAccount("8232749243", 2000);
		BankAccount acc3 = new BankAccount("8233249232", 2500);
		System.out.println(acc1.toString());
		
	}
}
class BankAccount implements iInterest{
	//Properties of bank account 
	private static int iD = 1000; //Internal Id
	private String accountNumber; //ID + 2-random digit number + first 2 of SSN
	private static final String routingNumber = "0045493257";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = iD + "" +random + SSN.subSequence(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	public void getName(String name) {
		this.name = name;
	}
	public String setName() {
		return name;
	}
	public void payBill(double Ammount) {
		System.out.println("Paying Bill: $" + Ammount);
		balance = balance - Ammount;
		showBalance();
	}
	public void makeDeposit(double Ammount) {
		System.out.println("Making a Deposit: $" + Ammount);
		balance = balance + Ammount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	public String toString() {
		return "[Name: " + name + "}\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
	
}
