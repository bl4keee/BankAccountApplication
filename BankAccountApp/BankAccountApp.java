package bankaccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
	
		List<Account> accounts = new LinkedList<Account>();
		
		
		// Read a CSV file, then create new accounts based on that data
		String file = "D:\\Programowanie\\JAVA DEV\\Java done github projects\\BankAccountApplication\\NewBankAccounts.txt";
		List<String[]> newAccountHolders = utilities.CSV.read(file); 
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSn, initDeposit));
			}
			else if(accountType.contentEquals("Checking")) {
				accounts.add(new Checking(name, sSn, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}	
		for (Account acc : accounts) {	
			System.out.println("\n*******************************");
			acc.showInfo();
		}
	}
}
