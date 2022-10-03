package bankaccountapp;

public class Checking extends Account {
	
	 //List common properties for  checking accounts
	int debitCardNumber;
	int debitCardPIN;
	
	
	//Constructor to  initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		//System.out.println("New Checking Account");
		//System.out.println("Account Number: " + this.accountNumber);
		setDebitcard();
	    
	}
	    
	 public void setRate() {
		 rate = getBaseRate()*.15;
		 
	 }
	
	
	
	    public void setDebitcard() {
	    	debitCardNumber = (int) (Math.random()*Math.pow(10,12));
	    	debitCardPIN = (int) (Math.random()*Math.pow(10,4));
	    }
	
	
	
	    public void showInfo() {
		
		System.out.println("Account Type: Checkings");
		super.showInfo();
		System.out.println(" Your Account Features are: " +
		                "\n Debit Card Number: " + debitCardNumber +
		                "\n Debit Card PIN: " + debitCardPIN );
		
	}



	



		// TODO Auto-generated constructor stub
	
	
	// List ant methods specific to the checking account
	

}
