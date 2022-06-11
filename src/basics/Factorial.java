package basics;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(sum(4));
		
		System.out.println("Factorial: " + fact(5));
		
		int[] numbers = {2, -3 ,6 ,4 ,10};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
		
	}
	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			System.out.println(sum + " + " + i);
			sum = sum + i;
		System.out.println(" = " + sum);	
		}
		return sum;
	}
	//write a function that computes factorial
	public static int fact(int n) {
		if (n == 0) {
			return 0;
		}
		
		return (fact(n-1)*n);
		
	}
	public static int findMin(int[] arr) {
		int min = arr[0] ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
			min = arr[i];
			
		}
		return min;
		
	}
	public static int findMax(int[] arr) {
		int max = arr[0] ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
			max = arr[i];
			
		}
		return max;
		
	}
	public static int findAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			 sum = sum + arr[i];
			System.out.println("Sum: " + sum);
		}
		return sum/arr.length;
	}
	
	
}