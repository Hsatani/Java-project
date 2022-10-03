package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name;
	String sSN;
	double balance;
	static int index = 10000;
	String accountNumber;
	double rate;
	
	//Constructor to set base properties and initialize the account
      public Account(String name, String sSN, double initDeposit) {
    	  this.name = name;
    	  this.sSN = sSN;
    	  balance = initDeposit;
    	  //System.out.println("Name: " + name + " " + " SSN: " + sSN  + " " + " BALANCE: $" + balance);
    	   
    	  //System.out.println("Name: " + name);
    	  //System.out.print("New Account: ");
    	  
    	  
		//Set Account Number
    	  index++;
    	  this.accountNumber = setAccountNumber();
    	  setRate();
    	  
    
    	  
      }
      
      public abstract void setRate();
      
      private String setAccountNumber() {
    	  String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
    	  int uniqueID = index;
    	  int randomNumber = (int)(Math.random()*Math.pow(10,3));
    	   return lastTwoOfSSN + uniqueID + randomNumber;
    	   
      }
      
      
      
      public void compound() {
    	  double accuredInterest = balance * (rate/100);
    	  System.out.println("Accured Interest: $" + accuredInterest);
    	  balance = balance + accuredInterest;
    
      }
      
	// List common methods - transaction
      
      public void deposit(double amount) {
    	  balance = balance + amount;
    	  System.out.println("Depositing $" + amount);
      }
      
      public void withdraw(double amount) {
    	  balance = balance - amount;
    	  System.out.println("Withdrawing $" + amount);
      }
      
      public void transfer(String toWhere, double amount) {
    	  balance = balance - amount;
    	  System.out.println("Treansfering $" + amount + " to " + toWhere);
    	  
      }
       public void printBalance() {
    	   System.out.println("Your Balance is Now: $" + balance);
       }
      
      
      
      
      
	  public void showInfo() {
    	  System.out.println(
    			  "Name: " + name +
    			  "\nAccount Number: " + accountNumber +
    			  "\nBalance: " + balance +
    			  "\nRate: " + rate );
      }
  
      

	
		// TODO Auto-generated constructor stub
	
}
