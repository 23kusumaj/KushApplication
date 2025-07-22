package wipro_java;

public class Bankaccount {
	private String accountHolder;
	private double balance;
	
	public Bankaccount(String accountHolder, double initialbalance) {
		this.accountHolder = accountHolder;
		this.balance = initialbalance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
		
		System.out.println("New Balance :" +balance);
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance.");
		}
		else {
			balance -= amount;
			System.out.println(amount + "withdrawn Remaining Balance:" +balance);
		}
		
	}
	
	public void displayDetails() {
		System.out.println("Account Holder:" +accountHolder);
		System.out.println("Balance:" + balance);
	}
}

	
	
	