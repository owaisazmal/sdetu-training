package basics;

public class FibonnaciApp {
	public static void main(String[] args) {
		//Fibonnaci no. is defined by the sum of 2 previous fibonnaci numbers
		System.out.println(fib(1));
	}
	public static int fib(int i) {
		if (i == 0) {
			return 0;
			
		}
		else if (i == 1) {
			return 1;
		}
		return (fib(i-1) + fib(i-2));
	}

}
