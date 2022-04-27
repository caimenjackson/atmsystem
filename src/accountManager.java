//package atmSystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class accountManager {

	public int AccNumber;
	public String FirstName;
	public String SurName;
	public int SortCode;
	public float Balance;
	public int Pin;
	private Scanner user_input;
	
}


	
	public String returnAccountDetails() {
		String line1 = "Name:" + FirstName + SurName;
		String line2 = "Account Details:" + AccNumber;
		String line3 = "Sortcode:" + SortCode;
		String line4 = "Balance" + Balance;
		String Details = line1 + "\n" + line2 + "\n"  + line3 + "\n" + line4;
		// reference: https://www.baeldung.com/java-string-newline#:~:text=In%20Windows%2C%20a%20new%20line,the%20end%20of%20our%20string. 
		return Details;
	}
	
	public float checkBalance() {
		String balancecheck = "Current Balance: " + Balance;
		return balancecheck;
	}
	
	public void updatedDetails(String FirstName, String SurName, int Pin) {
		String _FirstName = null;
		this.FirstName = _FirstName;
		String _SurName = null;
		this.SurName = _SurName;
		int _Pin = 0;
		this.Pin = _Pin;
		return;
	}
	

	
	public void createAccount (Scanner sc, ArrayList<accountManager> accounts) { 
		user_input = new Scanner( System.in ); 
		
		accountManager account = new accountManager();
		
		String FirstName;
		FirstName = user_input.next();
		String SurName;
		SurName = user_input.next( );
		String Full_Name;
		Full_Name = FirstName + "" + SurName;
		
		String Address;
		Address = user_input.next();
		String AddressRequesed;
		AddressRequesed = Address;	
		
		
		/*
		Random rand = new Random();
		int number = rand. nextInt(9999);
		// String.format(“%04d”,number) is supposed to convert any number sequence in 4 characters 
		//https://www.codegrepper.com/code-examples/java/generate+a+4+digit+random+number+in+java
		
		String returnString = String.format(“%04d”,number);
		 */
		
		int PinNum1 = (int)(Math.random()*10);
		int PinNum2 = (int)(Math.random()*10);
		int PinNum3 = (int)(Math.random()*10);
		int PinNum4 = (int)(Math.random()*10);
		 Pin = Integer.parseInt(Integer.toString(PinNum1) + Integer.toString(PinNum2) + Integer.toString(PinNum3) + Integer.toString(PinNum4));
	}
	

	
}







}
