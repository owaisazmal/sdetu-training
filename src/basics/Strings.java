package basics;

public class Strings {
	

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Rings";
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word: " + wordChoice);
			
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")); {//it will ignore the cleare case and will compare
		System.out.println("This browser is chrome!");	
		}
		String firstName = "Owais";
		String  lastName = "Khan";
		String SSN = "084839721";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//print the initial plus last 4 digits of SSN
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 3));
		System.out.println(SSN.substring(5));
		
	}

}
