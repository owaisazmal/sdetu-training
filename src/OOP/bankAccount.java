package OOP;

public class bankAccount implements IRate{
	
	String accNumber;
	String ssn;
	
	//static belongs to the class not the object instance
	//final constant (often static final)
	private static final String routingNum = "8923798";
	private String name;
	String accountType;
	double balance = 0;
	
	//constructor definitions: unique methods 
		//1. they are used to define/ setup / instantiate an object
		//2. Constructors are implicitly called upon Instantiation
		//3. the same name as the class itself 
		//4. Constructors have no return type at all
	bankAccount(){
		System.out.println("NEW ACCOUNT CREATED!!");	
	}
	//Overloading : Calling same method with different argument
	bankAccount(String accountType){
		System.out.println("New account: " + accountType);
	}
	bankAccount(String accountType, double initDeposit){
		//initDeposit call same method name with different argument.
		System.out.println("New account: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String msg = null;	
		if (initDeposit < 1000) {
				msg ="ERROR: Minimum deposit should be atleast $1,000";
				
			}
		else {
			msg  = "Thanks for your initial deposit of $: " + initDeposit;
		}
			System.out.println(msg);
			balance = initDeposit;
	}
	// Getters and setters
	
		//Allows the user to define the name
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		public String getName() {
			return name;
		}
		public void setssn(String ssn) {
			this.ssn = ssn;
		}
		public String getssn() {
			return ssn;
		}
	
		//interface Methods
		public void setRate() {
			System.out.println("Setting rate");
		}
		public void increaseRate() {
			System.out.println("Increasing Rate");
		}
		
	//define methods
	void deposit(double amt) {
		balance = amt + balance;
		showActivity("DEPOSIT");
	}
	void withdraw(double amt) {
		if (amt > balance) {
			System.out.println("Not sufficient Funds!");
		}
		else {
		balance = balance - amt ;
		showActivity("WITHDRAW");
		}
	}
	//private, can only be called within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " +  activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
		
	}
	void checkBalance() {
		System.out.println("Balance is: " + balance);
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". " + ". ACCOUNT#: " + accNumber + ". ROUTING#: " + routingNum + ". BALANCE: $" + balance + " ]";
	}
}
