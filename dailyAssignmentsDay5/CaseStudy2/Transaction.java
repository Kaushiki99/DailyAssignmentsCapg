package dailyAssignmentsDay5;

public class Transaction {
	private int accountNumber;

	public Transaction() {
		super();
	}
	 // parameter accountNumber
	 
	public Transaction(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	//return the accountNumber
	 
	public int getAccountNumber() {
		return accountNumber;
	}

	//parameter accountNumber the accountNumber to set
	 
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void execute() {
		System.out.println("Account Number : "+accountNumber);
	}
}

