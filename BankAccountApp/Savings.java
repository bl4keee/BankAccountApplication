package bankaccountApp;

public class Savings extends Account {
	
	// List of the properties specific to the savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the savings account
	public Savings(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}

	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3)); // Generates random 3 digit number for safetyDepositBoxID
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4)); // Generates random 4 digit number for safetyDepositBoxKey
	}
	
	// List any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Savings Account Features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID + 
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}
}
