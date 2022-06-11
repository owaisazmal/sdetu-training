package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is Starting");
		printName();
		int a = 10;
		int b = 20;
		addNumbers(a , b);
		int product = multiplyNumbers(a , b);
		System.out.println("The product of " + a +" and " + b + " is " + product);
	}
	static void printName() {
		System.out.println("My name is Owais");
	}
	
	static void addNumbers(int numA, int numB) {
		// This function will add 2 numbers
		int sum = numA + numB;
		System.out.println("total sum = " + sum);
	}
	
	static int multiplyNumbers(int numA, int numB) {
		//This function will multiply two numbers
		int product = numA * numB;
		addNumbers(product, product);
		return product;
		
	}
}
