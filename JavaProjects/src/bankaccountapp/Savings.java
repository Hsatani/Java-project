package bankaccountapp;

public class Savings extends Account {
	
	 //List common properties for  savings accounts
	int safetyDepositeBoxID;
	int safetyDepositeBoxKey;
	
	//Constructor to  initialize Savings account properties
	public Savings(String name,String sSN, double initDeposit) {
		super( name,sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		safetyDepositeBox();
		
		
	//	System.out.println("New Savings Account");
	//	System.out.println("Account Number: " + this.accountNumber);
	//  System.out.println(name);
	}
	
	private void safetyDepositeBox() {
		safetyDepositeBoxID = (int)(Math.random()*Math.pow(10,3));
        safetyDepositeBoxKey = (int)(Math.random()*Math.pow(10,4));
	}
	
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	
	
	
	// List ant methods specific to the Savings account
	public void showInfo() {
	
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				"Your Savings Account features" + 
		"\n Safety Deposite Box ID: " + safetyDepositeBoxID +
		"\nSafety Deposite Box Key:  " + safetyDepositeBoxKey );
	}

}
