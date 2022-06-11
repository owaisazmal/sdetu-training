package basics;

public class Cities {
	public static void main(String[] args) {
		//Declare and define arrays
		String [] Cities = {"New YOrk", "Los Angeles", "Delhi"};
		System.out.println(Cities[0]);
		System.out.println(Cities[1]);
		System.out.println(Cities[2]);
		
		//Declare the Arrays
		String[] States = new String[6];
		States [0] = "Torronto";
		States [1] = "California";
		States [2] = "Texas";
		States [3] = "Maharashtra";
		States [4] = "Nevada";
		States [5] = "Ohio";
		System.out.println(States[0]);
		
		
		System.out.println("\n****** Printing with do-while loop *******\n");
		
		//defining the array
		String[] Countries = new String[6];
		Countries[0] = "USA";
		Countries[1] = "India";
		Countries[2] = "Canada";
		Countries[3] = "Qatar";
		Countries[4] = "Oman";
		Countries[5] = "Dubai";
		int i = 0;
		//do loop enters the loop then tests condition
		do {
			System.out.println("Country: " + Countries[i]);
			i++;
		}while (i < Countries.length);
		
		System.out.println("\n***** Printing with While loop ******\n");
		
		//While loop tests the condition first then enters the loop
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String State = States [n];
			System.out.println(State);
			if (State == "Texas") {
				System.out.println("State found!!");
				stateFound = true;
			}
			n++;
		}
		System.out.println("\n ***** Printing with for loop *****\n");
		//For loop (the best structure)
		for (int y = 0; y < States.length; y++) {
			System.out.println(States[y]);
			
		}
			
	}

}
