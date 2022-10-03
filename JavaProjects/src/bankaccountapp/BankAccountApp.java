package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking chkacc1 = new Checking("Hardik Satani","375634536",1500);
		Savings savacc1 = new Savings("Hardik Satani2","124356789",2500);
		
		chkacc1.showInfo();
		chkacc1.deposit(3000);
		chkacc1.withdraw(500);
		chkacc1.transfer("Manthan", 1000);
		chkacc1.printBalance();
		System.out.println("***********");
		savacc1.compound();
		savacc1.showInfo();
		
		
		
		
		
    // Read a CSV file then create new accounts based on that data
		
	}

}
