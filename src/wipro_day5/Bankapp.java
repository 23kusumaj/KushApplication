package wipro_day5;

public class Bankapp {
	    public static void main(String[] args) {
	        Bank account = new SavingAccount(1000);

	        account.displayAccountType();                 // Overridden default method
	        account.executeTransaction("deposit", 1000);   // Deposit
	        account.executeTransaction("withdraw", 400);  // Withdraw
	        account.executeTransaction("withdraw", -50);  // Invalid
	        System.out.println("Final Balance: " + account.getBalance());
	    }
	}



