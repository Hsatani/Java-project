 package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String passWord;
	private String department;
	private String email;
	private int mailBoxcapacity = 500;
	private String alternateEmail;
	private int defaultpasswordLength = 10;
	private String companysuffix = "sataniempire.com";
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created " + this.firstName+ " " + this.lastName);
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
        //System.out.println("Department: " + this.department);	
		
		// Call a method that returns a random password
		this.passWord = randomPassword(defaultpasswordLength);
		//System.out.println("Your password is: " + this.passWord);
		
		// Combine elements to generate email
	    email = firstName.toLowerCase()+ "." + lastName.toLowerCase()+ "@" + department + "." + companysuffix;
		//System.out.println("Your Email is: " + email);
	}
	
	
	
	
	
	// Ask for the department
	
	private String setDepartment() {
		System.out.print("DEPARTMENTS CODES\n1 for Sales\n2 for Development\n3 for Accounting\n4 none\n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "Sales";}
		else if (depChoice == 2) { return "Dev"; }
		else if (depChoice == 3) { return "Accounting"; }
		else { return ""; }
	}
	
	// Generate a random password
	
	private String randomPassword (int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#!$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			System.out.print(passwordSet.charAt(rand));}
		return new String(password);
		
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity (int capacity) {
		this.mailBoxcapacity = capacity;
		
	}
	
	// set the alternate email
	public void setAlternetEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change the password
	public void changePassword (String password) {
		this.passWord = password;
	}
	
	public int getMailboxCapacity() { return mailBoxcapacity;}
	public String getAlternetEmail() { return alternateEmail; }
	public String getchangePassword() { return passWord;}
	
	public String showInfo() {
		
		return "DISPLAY NAME: " + firstName + " " + lastName +  
				"\nCompany Email: " + email +
				" \nMailbox Capacity " + mailBoxcapacity + "mb";
				
	}

}
