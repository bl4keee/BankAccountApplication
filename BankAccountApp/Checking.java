package bankaccountApp;

public class Checking extends Account {
	
	// List of the properties specific to the checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// List of any methods specific to the checking account
	private void setDebitCard() { 
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12)); // Generates random 12 digit number as debitCardNumber 
		debitCardPin = (int)(Math.random() * Math.pow(10, 4)); // Generates random 4 digit number as debitCardPin
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Checking Account Features" +
				"\n Debit Card Number: " + debitCardNumber + 
				"\n Debit Card PIN: " + debitCardPin
				);
	}
}
