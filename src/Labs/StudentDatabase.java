package Labs;

public class StudentDatabase {
	public static void main(String[] args) {
		student stu1 = new student("Owais", "823723173");
		
		stu1.pay(1000);
		stu1.enroll("Comp110");
		stu1.enroll("ENG105");
		System.out.println(stu1.toString());
	}
}
class student{
	//Properties
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String email;
	private String userId;
	private static int iD =0;
	private String courses;
	private static final int costofcourse = 800;
	private int balance = 0;
	//Constructor
	public student (String name, String SSN) {
		iD++;
		this.SSN = SSN;
		this.name = name;
		setEmail();
		setUserId();
	}
	private void setEmail(){
		email = name.toLowerCase() + "iD" + "@stuniversity.com";
		System.out.println("Your email is: " + email);
	}
	public String getEmail() {
		return email;
	}
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randomNumber = ( int )( Math.random()*(max - min));
		randomNumber = randomNumber+ min;
		userId = iD + randomNumber + SSN.substring(6); 
		System.out.println("Your userID is: " + userId);
	}
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		System.out.println(courses);
	}
	public void pay(int ammount) {
		balance = balance - ammount;
		System.out.println("Payment: $" + ammount);
	}
	public void checkBalnce() {
		System.out.println("Balance: $" + balance);
	}
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + " ]";
	}
	public void showCourses() {
		System.out.println(courses);
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
