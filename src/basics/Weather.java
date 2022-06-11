package basics;

public class Weather {
	public static void main(String[] args) {
		
	// this application will give the idea what to wear
	int temprature =  65;
	String SunCondition = "Overcast";
	
	if (temprature > 80) {
		System.out.println("It's a hot day Wear Shorts and t-Shirt");
		}
	else if((temprature > 60) && (temprature <= 50) && (SunCondition == "Sunny")) {
		System.out.println("It's a little cooler perhaps wear a long sleeves shirt and jeans");
		System.out.println("Wear a hat to prevent sunlight from your eyes");
	}
	else if (temprature > 50 || SunCondition == "Overcast" ) {
		System.out.println("It's a cool day make sure to wear warmer clothes");
	}
	else {
		System.out.println("Looks like a cool day, bring sweater!");
	}
	System.out.println("The program is ending.");
	}
}
