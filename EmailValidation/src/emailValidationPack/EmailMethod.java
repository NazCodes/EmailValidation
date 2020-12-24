package emailValidationPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailMethod {
	
	String email;
	
	List<String> myList = new ArrayList<String>();
	
	public void emailList () {
		myList.add("RandyOrtonOwns@wwe.com");
		myList.add("YoBroWatsGud@yobro.net");
		myList.add("RandyLo.c@gmail.com");
		myList.add("JohnJones24@gmail.com");
		myList.add("David_Smith45@yahoo.com");
		myList.add("Tom.Coles999@gmail.com");
		myList.add("DevonJones21@yahoo.com");
		myList.add("Erin.Anderson661@rnet.com");
		myList.add("EmilyGranger1235@gmail.com");
		myList.add("NathanBrooks34@gmail.com");
	}
	
	public void validateEmail() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Email");
		email = userInput.next();
		userInput.close();
		
		if(myList.contains(email)) {
			System.out.println(email + " Is A Valid Email");
		}else {
			System.out.println(email + " Is An Invalid Email");
		}
	}
}
